/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/Syst emFileSystem/Templates/Classes/Class.java to edit this template
 */
package javahello;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Tinh_Tong {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
for (int i = 0; i< t;i++){
long so = sc.nextLong();
long tong = ((so+1)*so)/2;
System.out.println(tong);
}
    }
}
