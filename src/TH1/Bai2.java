package TH1;
import java.util.*;
import java.io.*;

public class Bai2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            String a = "0", b = "0";
            for(int i = 0; i < n; i++){
                if(i % 2 == 0) a += ("" + arr[i]);
                else b += ("" + arr[i]);
            }
            System.out.println(Long.parseLong(a) + Long.parseLong(b));
        }
        
    }
}
//2
//6
//6  8   4   5 2    3
//5
//5 3 0 7 4
