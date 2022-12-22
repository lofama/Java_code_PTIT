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
public class Tong_giai_thua {
    public static long giaithua(int n){
        long tich = 1;
        if(n==1) return 1;
        for(int i=1;i<=n;i++)tich*=i ;
        return tich;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long[] f = new long[21];
        f[0]=0;
        for(int i=1;i<=20;i++) f[i]=f[i-1] + giaithua(i);
        int x= sc.nextInt();
        System.out.println(f[x]);
    }
}
