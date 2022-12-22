/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javahello;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Chia_tam_giac {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
for(int m=0;m<t;m++){
    int n = sc.nextInt();
    int h = sc.nextInt();
    for(int i=1;i<n;i++){
        double kq = h*(Math.sqrt((double)i/n));
        System.out.printf("%.6f ", kq);
    }
    System.out.printf("\n");
}
}    
}
