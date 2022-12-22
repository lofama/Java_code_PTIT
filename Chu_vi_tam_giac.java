/*
 * Click https://www.facebook.com/profile.php?id=100017104570541 to get to my profile
 *     [███ ███]▄▄▄▄▃ ♥ [̲̅A ̲̅][̲̅D ̲̅][̲̅D ̲̅]–[̲̅M ̲̅][̲̅E ̲̅] ♥
 *   ▄▅██ G.NAM █▅▄▃▂
 * [██████████████]
 * …◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤
 */
package javahello;
import java.util.*;
/**
 *
 * @author WINDOWS 10
 */
public class Chu_vi_tam_giac {
    public static double canh(double x1, double y1, double x2, double y2){
            double a = Math.sqrt((x1-x2)*(x1-x2) +(y1-y2)*(y1-y2));
            return a;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            
            double a = canh(x1,y1,x2,y2);
            double b = canh(x2,y2,x3,y3);
            double c = canh (x1,y1,x3,y3);
//            if(a+b>=c||b+c>=a||a+c>=b){
//                System.out.println("INVALID");
//            }
//            else
            {
                if(a+b>c&&b+c>a&&a+c>b){
                double chuvi = a+b+c;
                System.out.printf("%.3f",chuvi);
                System.out.println();}
                else System.out.println("INVALID");
        }
      }
    }
}
