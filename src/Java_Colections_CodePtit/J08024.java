package Java_Colections_CodePtit;
import java.util.*;
public class J08024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = "";
            s += "9";
            Queue <String> q = new ArrayDeque<>();
            q.offer(s);
            while(Integer.parseInt(q.peek()) % n != 0){
                String x = "0";
                String y = "9";
                x = q.peek() + x;
                y = q.peek() + y;
                q.poll();
                q.offer(x);
                q.offer(y);
            }
            System.out.println(q.peek());
        }
    }
}