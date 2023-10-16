package TH2;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
    
public class BAI_2_SO_DEP_1 {
    public static boolean check(int n){
        if((n + "").length() < 2) return false;
        for(int i = 0; i < (n + "").length() - 1; i++){
            if((n + "").charAt(i + 1) < (n + "").charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        FileInputStream f1 = new FileInputStream("DATA1.in");
        FileInputStream f2 = new FileInputStream("DATA2.in");
        ObjectInputStream o1 = new ObjectInputStream(f1);
        ObjectInputStream o2 = new ObjectInputStream(f2);
        ArrayList<Integer> arr1 = (ArrayList<Integer>) o1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) o2.readObject();
        int[] a = new int[100000];
        int[] b = new int[100000];
        for(Integer i : arr1){
            if(check(i)) a[i]++;
        }
        o1.close();
        for(Integer i : arr2){
            if(check(i)) b[i]++;
        }
        o2.close();
        for(int i = 0; i < 100000; i++){
            if(a[i] > 0 || b[i] > 0) System.out.println(i + " " + a[i] + " " + b[i]);
        }
    }
}