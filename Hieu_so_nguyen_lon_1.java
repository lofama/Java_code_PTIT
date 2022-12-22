/*
 * Click https://www.facebook.com/profile.php?id=100017104570541 to get to my profile
 *     [███ ███]▄▄▄▄▃ ♥ [̲̅A ̲̅][̲̅D ̲̅][̲̅D ̲̅]–[̲̅M ̲̅][̲̅E ̲̅] ♥
 *   ▄▅██ G.NAM █▅▄▃▂
 * [██████████████]
 * …◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤
 */
package javahello;
import java.math.BigInteger;
import java.util.*;
/**
 *
 * @author WINDOWS 10
 */
public class Hieu_so_nguyen_lon_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
BigInteger a =sc.nextBigInteger();
BigInteger b =sc.nextBigInteger();
if(a.compareTo(b)<0){
    BigInteger c = a;
    a=b;
    b = c;
}
BigInteger sub = a.subtract(b);
if (sub.toString().length()< a.toString().length()){
    System.out.print(0);
}
            System.out.println(sub);
        }
    }
}
