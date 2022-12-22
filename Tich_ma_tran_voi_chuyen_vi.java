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
public class Tich_ma_tran_voi_chuyen_vi {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int te = 1; te<=t;te++){
            int n = sc.nextInt(), m = sc.nextInt();
            int a[][] = new int[n][m];
            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Test "+te+":");
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    int x = 0;
                    for(int k = 0; k <m;k++) x+=a[i][k]*a[j][k];
                    System.out.print(x+" ");
                }
                System.out.println();
            }
        }
    }
}
