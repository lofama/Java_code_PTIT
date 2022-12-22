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
public class Sap_xep_chen {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0;i < n ; i++){
            a[0] = sc.nextInt();
            Arrays.sort(a);
            System.out.printf("Buoc "+i+": ");
            for(int j = 0;j<n;j++){
                if (a[j]!=0) System.out.printf(a[j]+" ");
            }
            System.out.println();
        }
    }
}
