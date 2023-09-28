package STRING;
import java.util.*;
public class J03024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            check(s);
        }
    }
    static void check(String s){
        if(s.charAt(0) == '0'){
            System.out.println("INVALID");
            return;
        }
        for(int i = 1; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                System.out.println("INVALID");
                return;
            }
        }
        int chan = 0, le = 0;
        for(char x : s.toCharArray()){
               if((x - '0') % 2 == 0) chan += 1;
               else le += 1;
        }
        if((chan > le && s.length() % 2 == 0) || (le > chan && s.length() % 2 != 0)) System.out.println("YES");
        else System.out.println("NO");
        return;
    }
}
//3
//01234aa32432432432534545b987978
//1234567890123456789000
//999999999999999999999999999999