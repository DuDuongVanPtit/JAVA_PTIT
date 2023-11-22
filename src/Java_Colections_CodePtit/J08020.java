package Java_Colections_CodePtit;
import java.util.*;
public class J08020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Stack <Character> st = new Stack<>();
            String s = sc.next();
            boolean check = true;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '(' || s.charAt(i) == '['|| s.charAt(i) == '{'){
                    st.push(s.charAt(i));
                }
                else{
                    if(st.isEmpty()){
                        check = false;
                    }
                    if(!check) break;
                    if(st.peek() == '(' && (s.charAt(i) == ']'|| s.charAt(i) == '}')){
                        check = false;
                    }
                    if(st.peek() == '{' && (s.charAt(i) == ']'|| s.charAt(i) == ')')){
                        check = false;
                    }
                    if(st.peek() == '[' && (s.charAt(i) == '}'|| s.charAt(i) == ')')){
                        check = false;
                    }
                    st.pop();
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
//2
//[()]{}{[()()]()}
//[(])