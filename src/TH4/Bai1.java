package TH4;
import java.math.*;
import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        BigInteger bg = new BigInteger(s);
        BigInteger a = new BigInteger("10");
        while(bg.compareTo(a) != -1){
            int tmp = bg.toString().length();
            BigInteger x = new BigInteger(bg.toString().substring(0, tmp/2));
            BigInteger y = new BigInteger(bg.toString().substring(tmp/2));
            bg = x.add(y);
            System.out.println(bg);
        }
    }
}
