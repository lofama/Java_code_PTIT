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
public class AJ02015_DS_KE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Vector<Integer>> v = new Vector<>();
        for (int i = 1; i <= n; i++) {
            Vector<Integer> a = new Vector<>();
            for (int j = 1; j <= n; j++) {
                int x = sc.nextInt();
                if (x == 1) {
                    a.add(j);
                }
            }
                v.add(a);
            
        }
        for (int i = 0;i<n;i++){
            System.out.printf("List(%d) = ",i+1);
            for(int j = 0;j<v.get(i).size();j++){
                System.out.printf(v.get(i).get(j)+" ");
            }
            System.out.println();   
        }
        
    } 
    
}