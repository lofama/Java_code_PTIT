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
public class Sap_xep_chon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int min = 102, vt = -1;
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i< n-1; i++){
            for(int j=i;j<n;j++) {
                if(a[j]<min){
                min =a[j];
                vt = j;
            }
            }
            a[vt] = a[i];
            a[i] = min;
            min = 102;
            System.out.printf("Buoc "+(i+1)+": ");
            for(int j = 0;j<n;j++)System.out.printf(a[j]+" ");
            System.out.println();
        }
    }
}
