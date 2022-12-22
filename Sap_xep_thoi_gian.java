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

class TG{
    private int gio, phut,giay;

    public TG() {
    }

    public TG(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    public int getGiay() {
        return giay;
    }

    public void setGiay(int giay) {
        this.giay = giay;
    }
    public TG(TG x){
        this.gio = x.getGio();
        this.phut = x.getPhut();
        this.giay = x.getGiay();
    }
    public void in(){
        System.out.println(gio+" "+phut+" "+giay);
    }
}

class listTG{
    public TG[] x;
    public int n;

    public listTG() {
        x = new TG[5000];
        n = 0;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        this.n = sc.nextInt();
        for(int i =0;i<n;i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        x[i] = new TG(a,b,c);
        }
    }
    public void sapXep(){
    TG temp = new TG();
    for(int i = 0;i<n-1;i++){
        for(int j = i+1;j<n;j++){
            if(x[i].getGio()>x[j].getGio()) {
                temp = new TG(x[i]);
                x[i]=new TG(x[j]);
                x[j]=new TG(temp);
            }
            if((x[i].getGio()==x[j].getGio())&&(x[i].getPhut()>x[j].getPhut())) 
                {
                temp = new TG(x[i]);
                x[i]=new TG(x[j]);
                x[j]=new TG(temp);
            }
            if((x[i].getGio()==x[j].getGio())&&(x[i].getPhut()==x[j].getPhut()))
            if(x[i].getGiay()>x[j].getGiay()) {
                temp = new TG(x[i]);
                x[i]=new TG(x[j]);
                x[j]=new TG(temp);
            }
        }
        }
    }
    public void in(){
        for (int i = 0 ;i<n;i++){
            x[i].in();
        }
    }
}

public class Sap_xep_thoi_gian {
    public static void main(String[] args) {
        listTG a = new listTG();
        a.nhap();
        a.sapXep();
        a.in();
    }
}
