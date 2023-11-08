package TH3;
import java.util.*;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Stack <String> s = new Stack<>();
            int n = sc.nextInt();
            String[] bt = new String[n];
            for(int i = 0; i < n; i++){
                bt[i] = sc.next();
            }  
            for(int i = n - 1; i >= 0; i--){
                if(bt[i].compareTo("+") == 0){
                    long a = Long.parseLong(s.peek());
                    s.pop();
                    long b = Long.parseLong(s.peek());
                    s.pop();
                    s.push(""+(a + b));
                }
                else if(bt[i].compareTo("-") == 0){
                    long a = Long.parseLong(s.peek());
                    s.pop();
                    long b = Long.parseLong(s.peek());
                    s.pop();
                    s.push(""+(a - b));
                }
                else if(bt[i].compareTo("*") == 0){
                    long a = Long.parseLong(s.peek());
                    s.pop();
                    long b = Long.parseLong(s.peek());
                    s.pop();
                    s.push(""+(a * b));
                }
                else if(bt[i].compareTo("/") == 0){
                    long a = Long.parseLong(s.peek());
                    s.pop();
                    long b = Long.parseLong(s.peek());
                    s.pop();
                    s.push(""+(a / b));
                }
                else{
                    s.push(bt[i]);
                }
            }
            System.out.println(s.peek());
        }
    }
}
//3
//7
//- + 2 * 3 1 9
//7 
//- + 8 * 7 5 9
//3 
//+ -10 -4