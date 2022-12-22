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
public class Thu_gon_day_so {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int x = 0;
   for(int i =0;i<n;i++){
        if(x>0){
            int t = sc.nextInt();
            if((a[-1+x]+t)%2==0) x--;
            else {
                a[x] = t;
                x++;}
        }
   
   else     {    a[x] = sc.nextInt();x++;}
   }
        System.out.println(x);
    }
    
}
