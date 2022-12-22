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
public class Xau_nhi_phan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long[] f = new long[93]; f[1]=1;f[2]=1;
        for(int i=3;i<93;i++)f[i]=f[i-1]+f[i-2];
        int t = sc.nextInt();
        while(t-->0){
        int N = sc.nextInt();
        long k = sc.nextLong();
        while(N>2){
            if(k>f[N-2]){
                N=N-1;
                k=k-f[N-1];
            }else{
                N = N - 2;
            }
//            System.out.println( k+","+N );
        }
        if(N==1) System.out.println(0);
        if(N==2) System.out.println(1);
        }
    }    
}
