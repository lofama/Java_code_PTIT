package javahello;
import java.util.*;
//class B implements Comparable{
//    int x1;
//    int x2;
//
//    public B(int x1, int x2) {
//        this.x1 = x1;
//        this.x2 = x2;
//    }
//
//    @Override
//    public String toString() {
//        return x1+" "+x2;
//    }
//    
//
//    @Override
//    public int compareTo(Object o) {
//        B o1 =(B) o ;
//        if (x2==o1.x2) return x1-o1.x1;
//    return x2-o1.x2;}
//    
//}
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.substring(0,3).toUpperCase()+s.substring(3, s.length());
        System.out.println(s);
    }
}