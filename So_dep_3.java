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
public class So_dep_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int flat = 0;
            String s = sc.nextLine();
            for(int i = 0;i<=(s.length()/2);i++){
                int x = s.charAt(i)-'0';
                if(x!=2&&x!=3&&x!=5&&x!=7){
                    flat = 1;
                    break;
                }
                if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                    flat = 1;
                    break;
                }
            }
            if(flat==1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
