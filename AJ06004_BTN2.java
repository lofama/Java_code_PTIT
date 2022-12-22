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
class SV{
    String msv,ten,sdt;
    int nhom;

    public SV(String msv, String ten, String sdt, int nhom) {
        this.msv = msv;
        this.ten = ten;
        this.sdt = sdt;
        this.nhom = nhom;
    }

    public SV() {
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getNhom() {
        return nhom;
    }

    public void setNhom(int nhom) {
        this.nhom = nhom;
    }

    @Override
    public String toString() {
        return msv+" "+ten+" "+sdt+" "+nhom;
    }
  
}
public class AJ06004_BTN2 {
    public static void main(String[] args) {
        ArrayList <SV> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i =0;i<t;i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String sdt = sc.nextLine();
            int id = sc.nextInt();
            sc.nextLine();
            li.add(new SV(ma,ten,sdt,id));
        }
        String []BT = new String[n];
        for (int i =0;i<n;i++){
            BT[i]=sc.nextLine();
        }
        li.sort((o1,o2)->o1.msv.compareTo(o2.msv));
        for (SV i: li){
            System.out.printf(i+" "+BT[i.nhom-1]);
            System.out.println();
        }
    }
}
