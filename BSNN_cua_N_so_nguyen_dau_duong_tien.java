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
public class BSNN_cua_N_so_nguyen_dau_duong_tien {
        public static long us(long a, long b) { 
    if (b == 0) 
        return a; 
    return us(b, a % b); 
}
    public static long bs(long a, long b){
        return (a*b/us(a,b));
    }
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while(t-->0){
         long bsc=1;
         long n = sc.nextInt();
         for(long i =2;i<=n;i++){
             bsc = bs(bsc,i);
         }
                 
         System.out.println(bsc);
     }
    }
}
