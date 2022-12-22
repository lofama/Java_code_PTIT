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
import java.util.*;

/**
 *
 * @author WINDOWS 10
 */
public class HelloFile {
    public static void main(String[] args){
        File f = new File("DATA.in");
       try { Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
               System.out.println(sc.nextLine());
        }
    }catch ( FileNotFoundException e ){
    System.out.println(e);
}   
}
}
