package Java_Colections_CodePtit;
import java.util.*;
public class J08022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Stack <Integer> st = new Stack<>();
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int[] ans = new int[n];
            ans[n - 1] = -1;
            st.push(a[n - 1]);
            for(int i = n - 2; i >= 0; i--){
                while(!st.empty() && st.peek() <= a[i]){
                    st.pop();
                }
                if(st.empty()) ans[i] = -1;
                else{
                    ans[i] = st.peek();
                }
                st.push(a[i]);
            }
            for(int x : ans){
                System.out.print(x + " ");  
            }
            System.out.println();
        }
    }
}
//3
//4
//4 5 2 25
//3
//2 2 2
//4
//4 4 5 5