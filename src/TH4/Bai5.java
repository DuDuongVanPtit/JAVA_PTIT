package TH4;
import java.util.*;
public class Bai5 {
    public static boolean check(char open, char close){
        return (open == '(' && close == ')' || open == '[' && close == ']');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Integer> stack = new Stack<>();
        int maxLength = 0;
        int currentLength = 0;
        int bestStart = 0;
        int bestEnd = 0;
        stack.push(-1);
        for(int i = 0; i <= s.length() - 1; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '['){
                stack.push(i);
            }
            else{
                if(!stack.isEmpty() && check(s.charAt(stack.peek()),  c)){
                     stack.pop();
                    if(!stack.isEmpty()){
                        currentLength = i - stack.peek();
                        if(currentLength > maxLength){
                            maxLength = currentLength;
                            bestStart = stack.peek() + 1;
                            bestEnd = i + 1;
                        }
                    }
                    else{
                        stack.push(i);
                    }
                }
                else{
                    stack.push(i);
                }
            }
        }
        int cnt = 0;
        String k = s.substring(bestStart, bestEnd);
        for(int i = 0; i < k.length(); i ++){
            if(k.charAt(i) == '['){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
