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
public class Tap_tu_rieng_cua_2_xau {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            s1 = s1.trim();
            s1 = s1.replaceAll("\\s+", " ");
            s2 = s2.trim();
            s2 = s2.replaceAll("\\s+", " ");
            int n1=0,n2=0;
            String[] st1 = s1.split(" ");
            for(String x : st1) n1++;
            ArraysSort(st1,n1);
            String[] st2 = s2.split(" ");
            for(String x : st2) n2++;
            for(int i = 0;i<n1;i++){
                int giong = 0;
                if(i>0&&st1[i].equals(st1[i-1])) continue;
                for (int j = 0; j<n2;j++){
                    if(st1[i].equals(st2[j])) {giong++;break;}
                }
                if(giong == 0) System.out.print(st1[i]+" ");
            }
            System.out.println();
         }
    }

    private static void ArraysSort(String[] st1, int n) {
for (int i =0;i<n;i++){
    for(int j = 0;j<n;j++){
        if(st1[i].compareTo(st1[j])>0){
        } else {
            String temp = st1[i];
            st1[i] = st1[j];
            st1[j] = temp;
        }
    }
}
    }
}
