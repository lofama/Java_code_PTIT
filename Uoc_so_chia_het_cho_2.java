/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javahello;
import java.util.*;
/**
 *
 * @author WINDOWS 10
 */
public class Uoc_so_chia_het_cho_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int s = 0;
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    if (i % 2 == 0)
                        s++;
                    if ((n / i) % 2 == 0)
                        s++;
                    if (i * i == n && i % 2 == 0)
                        s--;
                }
            }
            System.out.println(s);
        }
    }
}