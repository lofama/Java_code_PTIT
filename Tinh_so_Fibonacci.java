/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javahello;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author WINDOWS 10
 */
public class Tinh_so_Fibonacci {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    long[] f=new long[92];
    f[0]=1;f[1]=1;
    for(int i=2;i<92;i++) f[i]=f[i-1]+f[i-2];
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
//            if(n==1||n==2) System.out.println(1);
//            for(int i=2;i<n;i++) f[i]=f[i-1]+f[i-2];
            System.out.println( f[n-1]);
            t--;
        }
    }
}
