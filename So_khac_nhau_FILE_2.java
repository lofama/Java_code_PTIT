/*
 * Click https://www.facebook.com/profile.php?id=100017104570541 to get to my profile
 *     [███ ███]▄▄▄▄▃ ♥ [̲̅A ̲̅][̲̅D ̲̅][̲̅D ̲̅]–[̲̅M ̲̅][̲̅E ̲̅] ♥
 *   ▄▅██ G.NAM █▅▄▃▂
 * [██████████████]
 * …◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤
 */
package javahello;
    import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
/**
 *
 * @author WINDOWS 10
 */
public class So_khac_nhau_FILE_2 {

    public static void main(String[] args) throws IOException {
        DataInputStream dt = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] a = new int[1000];
        for (int i = 0; i < 100000; i++)
            a[dt.readInt()]++;
        for (int i = 0; i < 1000; i++)
            if (a[i] > 0)
                System.out.println(i + " " + a[i]);
        dt.close();
    }
}
