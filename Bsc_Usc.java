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
public class Bsc_Usc {
    public static long us(long a, long b){
        while(true){
            if(a>b)a=a-b; else b=b-a;
            if(a==b) return a;
        }
    }
    public static long bs(long a, long b){
        return (a*b/us(a,b));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long x,y;
            x=sc.nextLong();
            y=sc.nextLong();
            System.out.println(bs(x,y)+ " " +us(x,y));
            t--;
        }
    }
}
