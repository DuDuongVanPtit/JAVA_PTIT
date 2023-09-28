package TH1;
import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            char arr[] = s.toCharArray();
            int sum = 0;
            Arrays.sort(arr);
            for(char i : arr){
                if(!Character.isDigit(i)) System.out.print(i);
                else sum += (i - '0');
            }
            System.out.println(sum);
        }
        
    }
}
//2
//AC2BEW3
//ACCBA10D2EW30