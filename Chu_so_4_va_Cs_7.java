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
public class Chu_so_4_va_Cs_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        int dem = 0;
        for(long i = s ; i>0 ;i=i/10){
            if(i%10==4||i%10==7) dem++; 
            
    }
        if(dem==7||dem==4) System.out.printf("YES");
        else System.out.printf("NO");
}
}
