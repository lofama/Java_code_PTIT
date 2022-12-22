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
class Rectange{
    private double width;
    private double height;
    private String color;

    public Rectange() {
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
//
//    public void getColor() {
//        color = color.toLowerCase();
//        String a =color.substring(1,2).toUpperCase()+color.substring(2);        
//        color = a;
////        System.out.println(a);
//    }

    public void setColor(String color) {
        this.color = color;
    }
    public int findArea(){
        return (int)(height*width);
    }
    public int findPerimeter(){
        return (int)(height+width)*2;
    }
    public void in(){
        System.out.println(findPerimeter()+" "+findArea()+" "+color);
    }
    public void check(){
        if(height > 0 && width> 0 ) in();
        else System.out.println("INVALID");
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        this.width = sc.nextDouble();
        this.height = sc.nextDouble();
        this.color = sc.next();
        color = color.toLowerCase();
        String a =color.substring(0,1).toUpperCase()+color.substring(1);        
        color = a;
    }
}
public class Khai_bao_lop_HCN {
    public static void main(String[] args) {
        Rectange x = new Rectange();
        x.nhap();
        x.check();
    }
}
