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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//import java.util.Set;

/**
 *
 * @author WINDOWS 10
 */
public class Loai_bo_so_nguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> x = new ArrayList<>();
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                int a = sc.nextInt();
            }
            else x.add(sc.next());
        }
        x.sort((o1,o2)->o1.compareToIgnoreCase(o2));
        for(String i: x) System.out.print(i+" ");
    }
}
