/*
 * Click https://www.facebook.com/profile.php?id=100017104570541 to get to my profile
 *     [███ ███]▄▄▄▄▃ ♥ [̲̅A ̲̅][̲̅D ̲̅][̲̅D ̲̅]–[̲̅M ̲̅][̲̅E ̲̅] ♥
 *   ▄▅██ G.NAM █▅▄▃▂
 * [██████████████]
 * …◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤
 */
package javahello;
import java.io.*;
import java.util.*;
/**
 *
 * @author WINDOWS 10
 */
public class Tinh_tong_FILE {
    public static void main(String[] args) throws FileNotFoundException {
      try{  File f = new File("src/javahello/DATA.in");
        Scanner sc = new Scanner(f);
        long sum = 0;
        while(sc.hasNext()){
           if(sc.hasNextInt()){
           int x = sc.nextInt();
           sum+=x; }
           else sc.next();
        }
        System.out.println(sum);
    }
      catch(FileNotFoundException e ) {
            System.err.println(e);
        }
    }
}

