package Java_Colections_CodePtit;
import java.util.*;
public class J02009{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList <Pair> arr = new ArrayList<>();
        while(t-- > 0){
            Pair tmp = new Pair(sc.nextInt(), sc.nextInt());
            arr.add(tmp);
            
        }
        arr.sort((o1, o2)->{
            return o1.getK() - o2.getK();
        });
        Stack<Integer> ans = new Stack<>();
        for(Pair x : arr){
            if(ans.empty()){
                int tmp1 = x.getK() + x.getV();
                ans.push(tmp1);
                
            }
            else{
                if(ans.peek() < x.getK()){
                    ans.pop();
                    int tmp2 = x.getK() + x.getV();
                    ans.push(tmp2);
                }
                else{
                    int tmp = ans.peek() + x.getV();
                    ans.pop();
                    ans.push(tmp);
                }
            }
            
        }
        System.out.println(ans.peek());
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
//3
//2 1
//8 3
//5 7