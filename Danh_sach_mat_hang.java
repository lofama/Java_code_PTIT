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
class MH{
    private int ma;
    private String ten, dvi;
    private int mua, ban;

    public MH() {
    }
    public String getMa(){
        String x = "MH0";
        String i = String.valueOf(ma%10);
        String y = String.valueOf((ma%100)/10);
        return  x+y+i;
    }
    public MH(int ma, String ten, String dvi, int mua, int ban) {
        this.ma = ma;
        this.ten = ten;
        this.dvi = dvi;
        this.mua = mua;
        this.ban = ban;
    }
    public int geMa(){
        return ma;
    }
    public int lai(){
        return (ban - mua);
    }
    @Override
    public String toString() {
        return getMa()+" "+ten+" "+dvi+" "+mua+" "+ban+" "+lai();
                }
    public void in(){
        System.out.println(toString());
    }
}
class DSMH{
    private int n;
    private MH[] a;

    public DSMH() {
        n = 0;
        a = new MH[40];
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        this.n = sc.nextInt();
        a = new MH[n];
        
        for(int i =0; i<n;i++){
            sc.nextLine();
            int ma = i+1;
            String ten = sc.nextLine();
            String dvi = sc.nextLine();
            int mua = sc.nextInt();
            int ban = sc.nextInt();
            this.a[i] = new MH(ma,ten,dvi,mua,ban);
        }
    }
    public void sapxep(){
        for (int i = 0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(a[i].lai()<a[j].lai()){
                    MH temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                if(a[i].lai()==a[j].lai()){
                    if(a[i].geMa()>a[j].geMa()){
                    MH temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
              }
            }
        }
        
    for (int i = 0;i<n;i++) a[i].in();
    }
    
}
public class Danh_sach_mat_hang {
    public static void main(String[] args) {
        DSMH a = new DSMH();
        a.nhap();
        a.sapxep();
    }
}