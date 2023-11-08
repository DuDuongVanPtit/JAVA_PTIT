package TH3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Bai3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int I = sc.nextInt();
            ArrayList <Integer> b = new ArrayList<>();
            int[][] a = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                    if(j == I - 1){
                        b.add(a[i][j]);
                    }
                }
            }
            Collections.sort(b);
            int c = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(j == I-1){
                        System.out.print(b.get(c) + " ");
                        c++;
                    }
                    else{
                        System.out.print(a[i][j] + " ");
                    }
                }
                System.out.println();
            }
            
        }
    }
}
//1
//3 4 2
//5 8 0 3 9 7 6 4 8 10 15 27