package TH4;
import java.math.*;
import java.util.*;
import java.io.*;
public class Bai2 {
    public static boolean check(int n){
        if(n < 10) return false;
        int tmp = n % 10;
        n /= 10;
        while(n != 0){
            if(tmp > n % 10) return false;
            tmp = n % 10;
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       FileInputStream in1 = new FileInputStream("DATA1.in");
       FileInputStream in2 = new FileInputStream("DATA2.in");
       ObjectInputStream o1 = new ObjectInputStream(in1);
       ObjectInputStream o2= new ObjectInputStream(in2);      
       ArrayList <Integer> arr1 = (ArrayList<Integer>) o1.readObject();
       ArrayList <Integer> arr2 = (ArrayList<Integer>) o2.readObject();
       int[] mark1 = new int[10001];
       int[] mark2 = new int[10001];
       for(int i = 0; i <= 10000; i++){
           mark1[i] = 0;
           mark2[i] = 0;
       }
       for(Integer x : arr1){
           if(check(x)){   
               mark1[x]++;
           }
       }
       ArrayList <Integer> ans =new ArrayList<>();
       for(Integer x : arr2){
           if(check(x)){
               mark2[x]++;
               ans.add(x);
           }
       }
       ans.sort((x1, x2) -> {
           return x1-x2;
       });
       for(int i = 0; i <= 10000; i++){
           if(mark1[i]!= 0 || mark2[i] != 0){
               System.out.println(i + " " + mark1[i] + " " + mark2[i]);
           }
       }
    }
}
