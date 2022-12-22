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
public class Ma_tran_xoan_oc_tang_dan {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n*n];
        for(int i = 0;i < n*n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
        int h = 0;
        int[][] b = new int[n][n];
        int k = n-1;
        while(h<n*n){
        int    i = n-k-1;
        for(int j=i;j<=k;j++){
            if(h==n*n) break;
               b[i][j] = a[h];
               h++;
           }  
            for(int m = i+1 ;m <= n- 1-i; m++){
               if(h==n*n) break;
                b[m][n - 1-i] = a[h];
                h++;
            }
            for(int m = n-2-i;m > i; m--){
               if(h==n*n) break;
                b[n-1-i][m] = a[h];
                h++;
            }
            for(int m = n-1-i; m > i;m--){
               if(h==n*n) break;
                b[m][i] = a[h];
                h++;
            }
            k--;
        
        }
        for(int m = 0; m<n;m++){
            for(int x = 0;x<n;x++){
                System.out.printf( b[m][x] + " ");
            }
            System.out.println();
        }
    }
}
