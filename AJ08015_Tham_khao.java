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
public class AJ08015_Tham_khao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t --> 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long cnt = 0;
            Map<Long, Long> map = new HashMap<>();
            List<Long> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                list.add(x);
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                }
                else{
                    map.put(x, 1L);
                }
            }
            for (Long x : list) {
                if (map.containsKey(k - x)) {
                    cnt += map.get(k - x);
                    if (x == k - x) cnt -= 1;
                }
            }
            System.out.println(cnt/2);
        }

    }


}