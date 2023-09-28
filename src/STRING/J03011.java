package STRING;
import java.util.*;
import java.math.*;
public class J03011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());
            System.out.println(a.gcd(b));
        }
        sc.close();
    }
}
//Input
//1
//1221
//1234567891011121314151617181920212223242526272829
//Output
//3