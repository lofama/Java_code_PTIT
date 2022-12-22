/*
 * Click https://www.facebook.com/profile.php?id=100017104570541 to get to my profile
 *     [███ ███]▄▄▄▄▃ ♥ [̲̅A ̲̅][̲̅D ̲̅][̲̅D ̲̅]–[̲̅M ̲̅][̲̅E ̲̅] ♥
 *   ▄▅██ G.NAM █▅▄▃▂
 * [██████████████]
 * …◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤
 */
package javahello;
import java.util.*;
import java.io.*;
/**
 *
 * @author WINDOWS 10
 */
public class So_khac_nhau_FILE_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/javahello/DATA.in"));
        int []a = new int[1000];
        while(sc.hasNextInt()){
            a[sc.nextInt()]+=1;
        }
        for(int i = 0;i<1000;i++){
            if(a[i]>0) System.out.println(i+" "+a[i]);
        }
    }
}
