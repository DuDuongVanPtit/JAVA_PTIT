package STRING;
import java.util.*;
public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        Map <String, Integer> mp = new  HashMap<String, Integer>();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine().trim().toLowerCase();
            String[] tach = s.split("\\s+");
            String ans = tach[tach.length - 1];
            for(int i = 0; i < tach.length - 1; i++) ans += tach[i].charAt(0);
            if(mp.containsKey(ans)) mp.replace(ans, mp.get(ans) + 1);
            else mp.put(ans, 1);
            System.out.print(ans);
            if(mp.get(ans) > 1) System.out.print(mp.get(ans));
            System.out.println("@ptit.edu.vn");   
        }
    } 
}
//test
//4
//    nGUYEn    quaNG   vInH  
//   tRan   thi THU    huOnG
//   nGO   quoC  VINH
// lE            tuAn    aNH
//ans
//vinhnq@ptit.edu.vn
//huongttt@ptit.edu.vn
//vinhnq2@ptit.edu.vn
//anhlt@ptit.edu.vn
