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
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class AJ08010_Tim_tu_thuan_nghich_dai_nhat {
    public static boolean check(String x){
        for (int i =0;i<=x.length()/2;i++){
            if (x.charAt(i)!=x.charAt(x.length()-i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> li = new ArrayList<>();
        while(sc.hasNext()){
            li.add(sc.next());
        }
        int x = li.size();
        int []check0 = new int[x];
        boolean []check1 = new boolean[x];
        int []solan = new int[x];
        for (int i = 0; i<x;i++){
            check0[i]=0;
            solan[i]=0;
            for (int j = i; j < x;j++){
                if(li.get(i).equalsIgnoreCase(li.get(j))) {
                check0[i]=li.get(i).length();
                solan[i]++;
                }
            }
            check1[i]=check(li.get(i));
        }
        int ma=-1;
        for (int i = 0; i<x;i++){
            for (int j = i+1; j < x;j++){
                if(li.get(i).equals(li.get(j))) check1[j]=false;
            }
            if(check1[i]&&check0[i]>ma) ma = check0[i];
        }
        for (int i =0;i<x;i++){
            if(check1[i]&&check0[i]==ma)System.out.println(li.get(i)+" "+solan[i]);
        }
    }
}
