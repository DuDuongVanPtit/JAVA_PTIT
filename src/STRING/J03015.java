package STRING;
import java.util.*;
import java.math.BigInteger;
public class J03015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
//            int MAX = Math.max(a.toString().length(), b.toString().length());
//            String x = a.subtract(b).abs().toString();
//            int tmp = MAX - a.subtract(b).abs().toString().length();
//            while(tmp-- > 0){
//                System.out.print("0");
//            }
            System.out.println(a.subtract(b));
        }
    }
}
//000123456789012345678901234567890
//00000000000000001234567890