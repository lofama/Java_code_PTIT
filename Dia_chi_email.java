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
public class Dia_chi_email {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String[] h = new String[t];
        for(int n = 0; n < t; n++){
            String s = sc.nextLine();
            s = s.trim();
            s = s.replaceAll("\\s+"," ");
            s = s.toLowerCase();
            String[] x = s.split(" ");
            int dem =0;
            for(String a : x) dem++;
            
         String   st = x[dem-1];
            
            for(String i : x){ 
                if(i != x[dem-1]){
            st+=i.charAt(0);
                }
            }
            int de = 1;
            h[n]=st;
            for (int i = 0;i<n ;i++){
                if(st.equals( h[i]) ) de++;
            }
            String k = String.valueOf(de);
            if(de>1) st += k;
                        System.out.println(st+"@ptit.edu.vn");
        }
        
    }
}
