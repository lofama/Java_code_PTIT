/*
 * Click https://www.facebook.com/profile.php?id=100017104570541 to get to my profile
 *     [███ ███]▄▄▄▄▃ ♥ [̲̅A ̲̅][̲̅D ̲̅][̲̅D ̲̅]–[̲̅M ̲̅][̲̅E ̲̅] ♥
 *   ▄▅██ G.NAM █▅▄▃▂
 * [██████████████]
 * …◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤
 */
package javahello;

import java.util.Scanner;

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
    public void cong(Phanso p){
        long x = p.getTso();
        long y = p.getMso();
        tso = tso*y+x*mso;
        mso = y*mso;
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
public class Tong_phan_so {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
    long x[] = new long[4];
    for(int i = 0;i <4;i++) x[i]= sc.nextLong();
        Phanso a = new Phanso(x[0], x[1]);
        Phanso b = new Phanso(x[2],x[3]);
    a.cong(b);
    a.rutGon();
    }

}
