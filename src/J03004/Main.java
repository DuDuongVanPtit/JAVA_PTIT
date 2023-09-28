package J03004;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine().trim().toLowerCase();
            StringBuilder sb = new StringBuilder("");
            String [] arr = s.split("\\s+");
            for(String x : arr){
                sb.append(Character.toUpperCase(x.charAt(0)));
                sb.append(x.substring(1) + " ");
            }
            System.out.println(sb);
        }
    }
}
