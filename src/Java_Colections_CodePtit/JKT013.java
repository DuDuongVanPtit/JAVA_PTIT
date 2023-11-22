package Java_Colections_CodePtit;
import java.util.*;
public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue <String> q = new ArrayDeque<>();
            ArrayList <String> arr = new ArrayList<>();
            q.offer("6");
            q.offer("8");
            while(q.peek().length() <= n){
                String x = "6";
                String y = "8";
                if(q.peek().length() <= n){
                    arr.add(q.peek());
                }
                x = q.peek() + x;
                y = q.peek() + y;
                q.poll();
                q.offer(x);
                q.offer(y);
            }
            System.out.println(arr.size());
            for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
            System.out.println();
        }
    }
}