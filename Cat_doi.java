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
public class Cat_doi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<t;i++){
        String s = sc.nextLine();
        int a = 0;
        long so = 0;
        while(a<s.length()){
            if(s.charAt(a)=='1'){
                so = so*10+1;
            }else   if(s.charAt(a)=='0'||s.charAt(a)=='8'||s.charAt(a)=='9'){so = so*10;}else{  so = 0;break;}
      
            a++;
        }
        if(so==0) System.out.println("INVALID");
        else System.out.println(so);
      }
    }
}
