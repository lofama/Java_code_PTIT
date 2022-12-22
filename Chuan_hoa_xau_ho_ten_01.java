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
public class Chuan_hoa_xau_ho_ten_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            s = s.trim();
            s = s.replaceAll("\\s+"," ");
            String[] x = s.split(" ");
            for(String i : x){
                i = i.toLowerCase();
            char[] o =    i.toCharArray();
           String a = String.valueOf(o[0]);
            char[] b = a.toUpperCase().toCharArray();
            o[0]=b[0];
            i = String.valueOf(o);
            System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
