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
public class Dien_thoai_cuc_gach {
    public static char doi(char x){
        if(x=='a'|| x =='b'||x =='c') return '2';
        if(x=='d'|| x =='e'||x =='f') return '3';
        if(x=='g'|| x =='h'||x =='i') return '4';
        if(x=='j'|| x =='k'||x =='l') return '5';
        if(x=='m'|| x =='n'||x =='o') return '6';
        if(x=='p'|| x =='q'||x =='r'||x == 's') return '7';
        if(x=='t'|| x =='u'||x =='v') return '8';
        return '9';
    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            s = s.toLowerCase();
           
            char[] x = s.toCharArray();
            boolean check = true;
            
            for(int i = 0 ; i<s.length();i++){
                if( doi(x[i]) != doi(x[s.length()-1-i])){
                    check = false;
                    break;
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
