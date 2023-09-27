package J04004;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phanso p = new Phanso(sc.nextLong(), sc.nextLong());
        Phanso q = new Phanso(sc.nextLong(), sc.nextLong());
        sum(p, q);
    }
    static void sum(Phanso a, Phanso b){
        Phanso s = new Phanso();
        s.setTu(a.getTu() * b.getMau() + b.getTu() * a.getMau());
        s.setMau(a.getMau() * b.getMau());
        s.rutgon();
        System.out.printf("%d/%d", s.getTu(), s.getMau());
    }
}
