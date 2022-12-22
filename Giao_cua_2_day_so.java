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
public class Giao_cua_2_day_so {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        int[] a = new int[n+1];
        int []b = new int[m+1];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < m; i++) b[i] = sc.nextInt();
       a[n]=100001;
       b[m]=100002;
       Arrays.sort(a);
       Arrays.sort(b);
     
       int h = 0,k =0;
       while(h<n&&k<m){
           while(a[h]==a[h+1]) h++;
           while(b[k]==b[k+1]) k++;
       if(a[h]==b[k]){
           System.out.printf(a[h]+" ");
           h++;k++;           
       }else{
           if(a[h]>b[k]) k++;
           else h++;
       }
    }
       System.out.println();
  }
}
