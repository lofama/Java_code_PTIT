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
public class Rut_gon_xau_ki_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
            while(true){
            int ok = 0;
            for(int i = 1;i<s.length();i++){
            if(s.charAt(i)== s.charAt(i-1) ){
            s=s.substring(0,i-1)+s.substring(i+1);
            ok = 1;
            break;
            }    
        }
            if(ok==0) break;
    }
    if(s.length()==0) System.out.println("Empty String");
        else {
            System.out.println(s);
        }
    }
//    sc.close();
}
