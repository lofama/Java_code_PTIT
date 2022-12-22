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
public class Sap_xep_doi_cho_truc_tiep {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int temp = 0;
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i< n-1; i++){
            for(int j=i+1;j<n;j++) {
                if(a[j]<a[i]){
                temp =a[j];
                a[j]=a[i];
                a[i]=temp;
            }
            }
            System.out.printf("Buoc "+(i+1)+": ");
            for(int j = 0;j<n;j++)System.out.printf(a[j]+" ");
            System.out.println();
        }
    }
}
