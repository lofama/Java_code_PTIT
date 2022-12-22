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
public class Danh_dau_chu_cai {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[26];
        String s = sc.nextLine();
        for(int i = 0; i<s.length();i++){
            int x = s.charAt(i) - 'a';
            a[x] = 1;
        }
        int dem =0;
        for(int i:a){
            dem+=i;
        }
        System.out.println(dem);
    }
}
