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
public class So_uu_the{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int flat = 0;
            String s = sc.nextLine();
            int sochan=0;
             for(int i = 0;i<(s.length());i++){
                
                if(s.charAt(i)<'0'||s.charAt(i)>'9') {
                    flat = 2;
                  
                     break;
                }   }
             if(s.charAt(0)=='0'){
                    flat = 2;
                }
        if(flat==0){ for(int i = 0;i<s.length();i++){
                int x = s.charAt(i)-'0';
                if(x%2==0){
                  sochan++;
                }
           }
        }
//        System.out.println(flat);
        if(flat==0){
        if(sochan<=(s.length()/2)&&s.length()%2==0) flat = 1; 
        if(sochan>s.length()/2&&s.length()%2==1) flat = 1;
        }
//        System.out.println(flat);
            if(flat==1) System.out.println("NO");
            if(flat==0) System.out.println("YES");
            if(flat==2) System.out.println("INVALID");
        }
    }
}
