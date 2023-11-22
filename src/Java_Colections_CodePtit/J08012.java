package Java_Colections_CodePtit;
import java.util.*;
public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = t;
        int[] ans = new int[t + 1];
        while(t-- > 1){
            int x = sc.nextInt();
            int y = sc.nextInt();
            ans[x]++;
            ans[y]++;
        }
        for(int i = 1; i <= n; i++){
            if(ans[i] != 1 && ans[i] != n -1){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
//5
//1 2
//1 3
//1 4
//1 5