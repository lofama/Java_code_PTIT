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
public class Tong_uoc_so_1 {

    public static int[] a = new int[2000001];

    public static void sang() {
        for (int i = 2; i * i <= 2000000; i++) {
            if (a[i] == 0) {
                for (int j = i * i; j <= 2000000; j += i) {
                    a[j] = i;
                }
            }
        }
        for (int i = 2; i <= 2000000; i++) {
            if (a[i] == 0) {
            a[i]=i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sang();
        Long tong = 0L;
        int t = sc.nextInt();
        for (int o = 0; o < t; o++) {
            int n = sc.nextInt();
            while (n != 1) {
                tong += a[n];
                n /= a[n];
            }
        }
        System.out.println(tong);
    }
}
