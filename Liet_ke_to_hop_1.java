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
public class Liet_ke_to_hop_1 {

    public static void Lietke( int k, int n ){
        int []a = new int[k+1];
        for (int i = 1;i<=k;i++){
            a[i] = i;
        }
        boolean has_next=true;
    int dem = 1;
            for(int i = 1 ; i <= k;i++) System.out.print(a[i]);
            System.out.printf(" ");
            int i = k;
            while(has_next){
                if(a[i] < n-(k-i)){
                a[i]++;
                if(i<k)
                for(int j = i+1; j<=k;j++)a[j] = a[j-1]+1;
            for(int x = 1 ; x <= k;x++) System.out.print(a[x]);
            System.out.printf(" ");
            dem++;
            i = k;
            }
            else i--;
            if(i==0) {
                has_next = false;
            }
        }
            System.out.println();
             System.out.println("Tong cong co " + dem + " to hop");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Lietke( k , n );
    }
}
