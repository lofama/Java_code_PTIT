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
public class AJ08011_Liet_ke_va_dem {
    public static boolean check(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) - '0' > s.charAt(i + 1) - '0') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Long> map = new HashMap<>();
        List<String> li = new ArrayList<>();
        while (sc.hasNext()) {
            String x = sc.next();
            int ok=0;
            for (String i: li){
                if(i.equals(x)) ok = 1;
            }
            if (ok==0&&check(x)){
                li.add(x);
            }
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                if (check(x)) {
                    map.put(x, 1L);
                }
            }
        }
        Collections.sort(li,(o1,o2)->map.get(o2).compareTo(map.get(o1)));
        for (String i  : li){
            System.out.println(i+" "+map.get(i));
        }
    }
}
