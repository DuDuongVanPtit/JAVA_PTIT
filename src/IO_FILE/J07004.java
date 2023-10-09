package IO_FILE;
import java.io.*;
import java.util.*;
public class J07004 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        int a[] = new int[1001];
        for(int i = 0; i <= 1000; i++) a[i] = 0;
        while(sc.hasNextInt()){
            int tmp = sc.nextInt();
            a[tmp] += 1;
        }
        for(int i = 0; i <= 1000; i++){
            if(a[i] != 0) System.out.println(i + a[i]);
        }
    }
}
