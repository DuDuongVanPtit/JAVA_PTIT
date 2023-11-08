package J04015;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teachers a = new Teachers(sc.nextLine(), sc.nextLine(), sc.nextLong());
        String code = a.getCode();
        String leverAllowance = "";
        String jobTitle = "";
        jobTitle += code.substring(0, 2);
        leverAllowance += code.substring(2, 4);
        a.setAllowance(jobTitle);
        a.setIncome(leverAllowance);
        System.out.println(a);
    }
}
//HP04
//Tran Quoc Huy
//1578000