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
public class Hinh_vuong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] x = new int[4];
        int[] y = new int[4];
        for(int i = 0;i < 4;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        int a = x[3] - x[0];
        if(a<(y[3]-y[0])) a = y[3]-y[0];
        System.out.println(a*a);
    }
}
