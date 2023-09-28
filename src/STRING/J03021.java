package STRING;
import java.util.*;
public class J03021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String[] arr = {"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        while(t-- > 0){
            String s = sc.nextLine().toUpperCase();
            String ans = "";
            for(int i = 0; i < s.length(); i++){
                for(int j = 2; j < arr.length; j++){
                    if(arr[j].contains(Character.toString(s.charAt(i)))) ans += ("" + j);
                }
            }
            StringBuilder s1 = new StringBuilder(ans);
            s1.reverse();
            if(ans.compareTo(s1.toString()) == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
//2
//BOHIMA
//IamACoder