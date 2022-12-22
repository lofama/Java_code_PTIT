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
public class Phan_tich_thua_so_nguyen_to {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for(int te=1;te<=t;te++){
            int n = sc.nextInt();
            System.out.printf("Test " + te + ": ");
//            int x=n/2;
            for(int i = 2; i<=n;i++){
                    int dem=0;
                    while(n%i==0){
                        dem++;
                        n=n/i;
                    }
                    if(dem!=0) System.out.printf("%d(%d) ",i,dem);
              
            } 
            if(n!=1) System.out.printf("%d(1) ",n);
            System.out.printf("\n");
        }
    }

}
