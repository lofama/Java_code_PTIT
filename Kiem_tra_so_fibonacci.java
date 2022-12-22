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
public class Kiem_tra_so_fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long[] f = new long[93];
        f[0]=0; f[1]=1;
        for(int i=2;i<93;i++)f[i]=f[i-1]+f[i-2];
        int t = sc.nextInt();
        while(t>0){
        long n = sc.nextLong();
        for(int i=0;i<92;i++){
                if(f[i]==n) {System.out.println("YES"); break;} else{
                if(f[i]>n){
                    System.out.println("NO");
                    break;
             }
                }
        }
        t--;
    }
    }
}