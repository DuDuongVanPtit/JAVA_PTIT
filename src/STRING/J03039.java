package STRING;
import java.math.BigInteger;
import java.util.*;
public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String x = sc.next().trim();
            String y = sc.next().trim();
            BigInteger a = new BigInteger(x);
            BigInteger b = new BigInteger(y);
            BigInteger c = new BigInteger("0");
            if(a.mod(b).compareTo(c) == 0 || b.mod(a).compareTo(c) == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
//2
//18 7
//3 123