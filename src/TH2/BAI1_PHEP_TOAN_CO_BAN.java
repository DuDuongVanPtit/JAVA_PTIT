package TH2;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class BAI1_PHEP_TOAN_CO_BAN {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        BigInteger sum = new BigInteger("0");
        List<BigInteger> arr = new ArrayList<>();
        while(t-- > 0){
            BigInteger a = new BigInteger(sc.next());
            arr.add(a);
            sum = sum.add(a);
        }
        Collections.sort(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size() - 1));
        System.out.println(sum);
    }
}
//E:\\3-NAM BA_2023-2024\\KI I\\JAVA_PTIT\\src\\TH\\data.txt