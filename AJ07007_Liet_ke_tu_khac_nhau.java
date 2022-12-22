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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
class WordSet{
    public ArrayList<String> li= new ArrayList<>();

    public WordSet() {
    }

    public WordSet(String a) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            if (sc.hasNext()){
                String x = sc.next().toLowerCase();
                int ok =0;
                for (int i = 0;  i < li.size();i++){
                    if (x.equals(li.get(i))){
                        ok = 1;
                        break;
                    }
                }
                if (ok == 0){
                    li.add(x);
                }
            }
        }
        li.sort((o1,o2)->o1.compareTo(o2));
    }

    @Override
    public String toString() {
        String s = "";
        for (String i: li){
            s+=i+"\n";
        }
        return s;
    }
    
    
}
public class AJ07007_Liet_ke_tu_khac_nhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
