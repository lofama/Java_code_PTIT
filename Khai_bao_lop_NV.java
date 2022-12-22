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

class NhanVien {

    private String mnv, ten, gioitinh, nsinh, diachi, msthue, ngaykihd;

    public NhanVien() {
    }

    public NhanVien(String mnv, String ten, String gioitinh, String nsinh, String diachi, String msthue, String ngaykihd) {
        this.mnv = mnv;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.nsinh = nsinh;
        this.diachi = diachi;
        this.msthue = msthue;
        this.ngaykihd = ngaykihd;
    }

    public void in() {
        System.out.println(mnv + " " + ten + " " + gioitinh + " " + nsinh + " " + diachi + " " + msthue + " " + ngaykihd);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        this.mnv = "00001";
        this.ten = sc.nextLine();
        this.gioitinh = sc.nextLine();
        this.nsinh = sc.nextLine();
        this.diachi = sc.nextLine();
        this.msthue = sc.nextLine();
        this.ngaykihd = sc.nextLine();
        in();
    }
}

public class Khai_bao_lop_NV {

    public static void main(String[] args) {
        NhanVien a = new NhanVien();
        a.nhap();
    }
}
