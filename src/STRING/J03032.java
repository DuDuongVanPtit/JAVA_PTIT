package STRING;
import java.util.*;
public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String[] s = sc.nextLine().split("\\s+");
            for(String x : s){
                for(int i = x.length() - 1; i >= 0; i--){
                    System.out.print(x.charAt(i));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
//2
//ABC DEF
//123 456