/*
 * Click https://www.facebook.com/profile.php?id=100017104570541 to get to my profile
 *     [███ ███]▄▄▄▄▃ ♥ [̲̅A ̲̅][̲̅D ̲̅][̲̅D ̲̅]–[̲̅M ̲̅][̲̅E ̲̅] ♥
 *   ▄▅██ G.NAM █▅▄▃▂
 * [██████████████]
 * …◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤
 */
package javahello;
import java.util.*;
/**
 *
 * @author WINDOWS 10
 */
public class Dem_so_lan_xuat_hien {
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
        int t = sc.nextInt();
        for(int o = 1; o <= t;o++){
            int n = sc.nextInt();
            int []a = new int[n];
            for(int i = 0;i<n;i++) a[i]=sc.nextInt();
            System.out.println("Test "+ o +":");
            for(int i = 0;i<n;i++){
                int dem = 0;
                if(a[i]!=-1){
                    dem++;
              for(int j=i+1;j<n;j++){
                  if(a[j]==a[i]){
                        dem++;
                        a[j]=-1;
                    }
                }
              System.out.println(a[i] +" xuat hien "+ dem +" lan");
            }
          }
        }
    }
}
