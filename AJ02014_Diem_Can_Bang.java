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
public class AJ02014_Diem_Can_Bang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
        int n = sc.nextInt();
        long sum = 0;
        int []a = new int[n];
        for (int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            sum+=a[i];
        }
        int kq = 0;
        long s = 0;
        sum-=a[0];
        while(true){
            s +=a[kq];
            kq+=1;
            if (kq == n) break;
            sum -= a[kq];            
            if (sum==s) break;
        }
        if (sum==s){
            System.out.println(kq+1);
        }
        else System.out.println(-1);
        }
    }
}
