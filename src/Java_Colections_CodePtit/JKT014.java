package Java_Colections_CodePtit;
import java.util.*;
public class JKT014{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Stack <Pair> st = new Stack<>();
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int[] ans = new int[n];
            ans[0] = 1;
            Pair tmp = new Pair(a[0], 0);
            st.push(tmp);
            for(int i = 1; i < n; i++){
                while(!st.empty() && st.peek().getK() <= a[i]){
                    st.pop();
                }
                if(st.empty()){
                    ans[i] = i + 1;
                }
                else{
                    ans[i] = i - st.peek().getV();
                }
                Pair tmp1 = new Pair(a[i], i);
                st.push(tmp1);
            }
            for(int i = 0; i < n; i++){
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
    
    public static class Pair{
        private int k, v;

        public Pair(int k, int v) {
            this.k = k;
            this.v = v;
        }

        public int getK() {
            return k;
        }

        public int getV() {
            return v;
        }
    }
}
//1
//7
//100 80 60 70 60 75 85