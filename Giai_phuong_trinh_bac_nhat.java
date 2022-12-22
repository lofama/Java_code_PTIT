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
public class Giai_phuong_trinh_bac_nhat {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a==0&&b==0){
    System.out.println("VSN");
    }else{
        if(a==0){
            System.out.println("VN");
        }else{
        double c = (double)(-b)/a;
        System.out.printf("%.2f", c);
            }
        }
    }
}
