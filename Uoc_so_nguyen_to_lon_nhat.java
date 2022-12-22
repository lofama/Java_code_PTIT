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
public class Uoc_so_nguyen_to_lon_nhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++){
            long n = sc.nextLong();
            long nto = 2;
            for(long i = 2; i <= Math.sqrt(n); i++){
               while(true){ if ( n % i == 0 ){
                    n = n / i;
                    if( i > nto ) nto = i;
                }
               else break;
              }
            }
            if( n > nto ) nto = n;
        System.out.println(nto);
        }
    }
}
