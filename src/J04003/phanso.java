import java.util.Scanner;
/**
 *
 * @author admin
 */
public class phanso {
    private String name;
    private String date;
    private double mon1,mon2,mon3;
    public phanso(String name,String date,double mon1,double mon2,double mon3){
        this.name=name;
        this.date=date;
        this.mon1=mon1;
        this.mon2=mon2;
        this.mon3=mon3;
    }
    public String toString(){
        return this.name+" "+this.date+" "+String.format("%.1f", this.mon1 +this.mon2+this.mon3);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        phanso x=new phanso(in.nextLine(),in.nextLine(),in.nextDouble(),in.nextDouble(),in.nextDouble());
        System.out.println(x);
    }
}