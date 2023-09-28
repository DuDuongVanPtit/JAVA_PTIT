package STRING;
import java.util.*;
public class J03006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            check(s);
        }
    }
    static void check(String s){
            StringBuilder tmp = new StringBuilder(s);
            tmp.reverse();
            if(tmp.toString().compareTo(s) != 0){
                System.out.println("NO");
                return;
            }
            for(char x : s.toCharArray()){
                if(x != '2' && x != '3' && x != '5' && x != '7'){
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
            return;
    }
}
