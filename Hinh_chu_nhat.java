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
public class Hinh_chu_nhat {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        long d = sc.nextLong();
        long r = sc.nextLong();
        if(d<=0||r<=0) System.out.println("0");
        else System.out.println(((d+r)*2)+" "+(d*r));
    }
}
