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


class Phanso{
    private long tso;
    private long mso;

    public Phanso(long tso, long mso) {
        this.tso = tso;
        this.mso = mso;
    }

    public Phanso() {
    }

    public long getTso() {
        return tso;
    }

    public void setTso(long tso) {
        this.tso = tso;
    }

    public long getMso() {
        return mso;
    }

    public void setMso(long mso) {
        this.mso = mso;
    }

    public void rutGon(){
        long x = GCD(tso,mso);
        tso = tso/x;
        mso = mso/x;
        System.out.println(tso + "/" + mso);
    }
    
    public long GCD(long a,long b){
        if(b==0) return a;
        else return GCD(b,a%b);
    } 
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        this.tso = sc.nextLong();
        this.mso = sc.nextLong();
    }
}
public class TestPhanSo {
    public static void main(String[] args){
        Phanso a = new Phanso();
    a.nhap();
    a.rutGon();
    }
}