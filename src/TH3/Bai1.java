package TH3;
import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int[] a = new int[1002];
            for(int i = 0; i <= 1000; i++){
                a[i] = 0;
            }
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                a[sc.nextInt()] = 1;
            }
            for(int i = 0; i <= 1000; i+= 2){
                if(a[i] != 0){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            for(int i = 999; i >= 1; i-=2){
                if(a[i] != 0){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        
    }
}
//1
//8
//3 7 12 8 5 4 888 7