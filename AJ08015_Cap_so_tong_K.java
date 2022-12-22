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
public class AJ08015_Cap_so_tong_K {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long dem = 0; 
            Map <Long,Long> map = new HashMap<>();
            List<Long> li = new ArrayList<>();
            
            for (int i = 0;i<n;i++){
                long x = sc.nextLong();
                li.add(x);
                if(map.containsKey(x)){
                    map.put(x, map.get(x)+1);
                }
                else map.put(x, 1L);
            }
            for (Long i : li){
                if (map.containsKey(k-i)){
                    dem+=map.get(k-i);
                    if (i == k-i) dem-=1;
                }
            }
            System.out.println(dem/2);
        }
    }
}
