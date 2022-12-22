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
public class Ma_tran_nhi_phan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]a = new int[n][3];
        int dem = 0;
        for (int i = 0;i<n;i++){
            int sum = 0;
            for( int j = 0;j<3;j++){
                a[i][j] = sc.nextInt();
                sum+=a[i][j];
            }
            if(sum>1) dem++;
        }
        System.out.println(dem);
    }
}
