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
public class Bo_sung_day_so {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        a[0]=0;
        for(int i = 1; i <=n; i++) a[i] = sc.nextInt();
        if(a[n]==n) System.out.println("Excellent!");
        else{
            int x = a[0],h=1;
            while (h<=n){
            if(a[h]-x > 1) {
                x++;
                System.out.println(x);
            }else{
                if(a[h]-x==1){
                    x++;
                    h++;
                }
              }
           }
        }
    }
}
