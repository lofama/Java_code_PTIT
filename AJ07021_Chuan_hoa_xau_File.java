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
public class AJ07021_Chuan_hoa_xau_File {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String s = sc.nextLine().toLowerCase();
//            System.out.println(s);
            if (s.equals("end") == true)
                break;
            String []a = s.trim().split("\\s+");
            for(String i : a){
                i = i.substring(0, 1).toUpperCase()+i.substring(1);
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
