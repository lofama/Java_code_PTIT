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
public class Tinh_luy_thua {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            long a=sc.nextLong(),b = sc.nextLong();
            if(a==0&&b==0) break;
            long lt =1,CONST = 1000000007;
            a = a%CONST;
            long c = a;
         while(b>=1){
                if(b%2!=0){
                    lt*=c;
                    lt%=CONST;
                }
                
                b = b/2;
c= c*c %CONST;
            }
            System.out.println(lt);
        }
    }
}
