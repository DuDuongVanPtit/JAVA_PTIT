package ARRAY;
import java.util.*;
public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack <Integer> st = new Stack<>();
        for(int i = 1; i <= n; i++){
            int tmp = sc.nextInt();
            if(!st.empty() && (st.peek() + tmp) % 2 == 0){
                st.pop();
            }
            else st.push(tmp);
        }
        System.out.println(st.size());
    }
}
