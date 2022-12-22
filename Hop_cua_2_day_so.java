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
public class Hop_cua_2_day_so {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        int[] a = new int[1000001];
       for(int i = 0; i<1000001;i++) {
       a[i]=0;
     }
        for(int i = 0; i < n; i++) {int x = sc.nextInt(); a[x]=1;}
        for(int i = 0; i < m; i++) {int x = sc.nextInt(); a[x]=1;}
        for(int i = 0; i<1000001;i++){
            if(a[i]==1) System.out.printf(i+" ");
        }
    }
}