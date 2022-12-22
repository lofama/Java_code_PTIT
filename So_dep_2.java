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
public class So_dep_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int flat = 0;
            String s = sc.nextLine();
            int sum = 0;
            for(int i = 0;i<(s.length());i++){
                if((s.charAt(0)-'0')!=8){
                    flat = 1;
                    break;
                }
                sum+=(s.charAt(i)-'0');
                if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                    flat = 1;
                    break;
                }
//                System.out.println(flat+","+sum);
            }
            if(sum%10!=0 ) flat =1;
            if(flat==1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
