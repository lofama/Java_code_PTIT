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
    public class So_nguyen_to {
    public static boolean nguyento(int x){
        if(x<2) return false; else{
            if(x==2) return true; else{
        for(int i=2;i<=x/2;i++){
            if(x%i==0) return false;
        }
        return true;
            }
        }
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t =  sc.nextInt();
    for(int i=0;i<t;i++){
    int n = sc.nextInt();
    if(nguyento(n)) System.out.println("YES"); else{
        System.out.println("NO");
    }
    }
    }
}
