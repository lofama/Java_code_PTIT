/*
 * Click https://www.facebook.com/profile.php?id=100017104570541 to get to my profile
 *     [███ ███]▄▄▄▄▃ ♥ [̲̅A ̲̅][̲̅D ̲̅][̲̅D ̲̅]–[̲̅M ̲̅][̲̅E ̲̅] ♥
 *   ▄▅██ G.NAM █▅▄▃▂
 * [██████████████]
 * …◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤
 */
package javahello;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author WINDOWS 10
 */
public class AJ07015_So_nguyen {
    public static int[] a = new int[10000];
    public static void sang(){
        Arrays.fill(a, 1);
        a[1]=a[0]=0;
        for (int i = 2;i<100;i++){
            if (a[i]==1){
            for (int j = i*i;j<10000;j+=i){
                a[j]=0;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        sang();
        ObjectInputStream j = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> li = (List<Integer>) j.readObject();
        int []f = new int[10000];
        for (Integer i : li ){
                f[i]+=a[i];
        }
            for (int i = 0; i< 10000;i++){
                if (f[i]>0){
                    System.out.println(i +" "+f[i]);
                }
            }
        }
        
    }
