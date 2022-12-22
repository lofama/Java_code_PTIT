package javahello;

/*
 * Click https://www.facebook.com/profile.php?id=100017104570541 to get to my profile
 *     [███ ███]▄▄▄▄▃ ♥ [̲̅A ̲̅][̲̅D ̲̅][̲̅D ̲̅]–[̲̅M ̲̅][̲̅E ̲̅] ♥
 *   ▄▅██ G.NAM █▅▄▃▂
 * [██████████████]
 * …◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤
 */
/**
 *
 * @author WINDOWS 10
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class A_Tao_File_nhi_phan {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();
            list.add(x);
        }
        File file = new File("src/javahello/Data.dat");
        try {
            if (!file.exists()) {
                if (file.createNewFile()) {
                    FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(list);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
