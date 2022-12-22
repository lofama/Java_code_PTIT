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
public class In_ma_tran {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[][] = new int[n][n];
            for(int i = 0 ; i < n; i++){
                for(int j = 0; j < n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
              for(int i = 0 ; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(i%2==0) System.out.printf(a[i][j]+" ");
                    else System.out.printf(a[i][n-1-j]+" ");
                }
            }
             System.out.println(); 
        }
    }
}
