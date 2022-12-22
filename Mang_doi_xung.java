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
public class Mang_doi_xung {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n; i++){
                arr[i]=sc.nextInt();
            }
            int flat = 0;
            for(int i = 0; i < n/2;i++){
                if(arr[i]!=arr[n-i-1]){
                    flat = 2 ;
                    System.out.println("NO");
                    break;
                }
            }
            if(flat==0) System.out.println("YES");
        }
    }
}
