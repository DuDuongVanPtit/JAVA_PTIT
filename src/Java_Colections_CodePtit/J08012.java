package Java_Colections_CodePtit;
import java.util.*;
public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Map <Integer, Integer> mp = new HashMap<>();
        while(t-- > 0){
            mp.put(sc.nextInt(), sc.nextInt());
        }
        if(mp.size() == 1) System.out.println("Yes");
        else System.out.println("No");
    }
}
//5
//1 2
//1 3
//1 4
//1 5