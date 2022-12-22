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
class GiaoVien{
    private String ma,ten;
    private int luongcb;
    private int pcap;
    private int luong;
    private int bac;

    public GiaoVien() {
    }

    public GiaoVien(String ma, int luongcb, int pcap, int luong) {
        this.ma = ma;
        this.luongcb = luongcb;
        this.pcap = pcap;
        this.luong = luong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(int luongcb) {
        this.luongcb = luongcb;
    }

    public int getPcap() {
        return pcap;
    }

    public void setPcap() {
        if (ma.charAt(0)=='H'){
            if(ma.charAt(1)=='T')
                this.pcap = 2000000;
            if(ma.charAt(1)=='P')
                this.pcap = 900000;
        }
        else
            this.pcap = 500000;
    }
    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
    public int tinhLuong(){
        int x = 0;
        x = pcap + luongcb*bac;
        return x;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        this.ma = sc.nextLine();
        this.ten = sc.nextLine();
        this.luongcb = sc.nextInt();
        this.bac = (ma.charAt(2)-'0')*10+(ma.charAt(3)-'0');
        setPcap();
    }   

    @Override
    public String toString() {
        return ma +" "+ten+" "+bac+" "+pcap+" "+tinhLuong();
                }
    
    public void in(){
        System.out.println(toString());
    }
}
public class Tinh_thu_nhap_giao_vien {
    public static void main(String[] args) {
        GiaoVien n = new GiaoVien();
        n.nhap();
        n.in();
        
    }
   
}
