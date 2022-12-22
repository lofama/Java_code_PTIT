/*
 * Click https://www.facebook.com/profile.php?id=100017104570541 to get to my profile
 *     [███ ███]▄▄▄▄▃ ♥ [̲̅A ̲̅][̲̅D ̲̅][̲̅D ̲̅]–[̲̅M ̲̅][̲̅E ̲̅] ♥
 *   ▄▅██ G.NAM █▅▄▃▂
 * [██████████████]
 * …◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤
 */
package javahello;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class AJ07078 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
           String s1 = sc.nextLine();
           String s2 = sc.nextLine();
           int k = 0;
           while(true){
               int m = s1.indexOf(s2,k);
               if (m==-1) break;
               else {System.out.printf((m+1)+" ");
               k=m+1;
               }
           }
            System.out.println();
    }
}
    }
