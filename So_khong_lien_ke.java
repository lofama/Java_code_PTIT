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
public class So_khong_lien_ke {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            int flat = 0,tong=0;
            for(int i = 0;i<s.length()-1;i++){
                if (Math.abs(s.charAt(i)-s.charAt(i+1))!=2){
                    flat = 2;
                    System.out.println("NO");
                    break;
                }
                tong = tong + (s.charAt(i)-'0');
            }
            tong = tong+(s.charAt(s.length()-1)-'0');
            if(tong%10!=0&&flat==0){
                flat = 2;
                System.out.println("NO");
            }
            if(flat == 0) System.out.println("YES");
        }
    }
}
