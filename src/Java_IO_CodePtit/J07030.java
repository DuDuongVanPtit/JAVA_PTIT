package Java_IO_CodePtit;

import java.io.*;
import java.util.*;

public class J07030 {
    public static boolean check(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
         FileInputStream in1 = new FileInputStream("DATA1.in");
         FileInputStream in2 = new FileInputStream("DATA2.in");
         ObjectInputStream o1 = new ObjectInputStream(in1);
         ObjectInputStream o2 = new ObjectInputStream(in2); 
         ArrayList <Integer> arr1 = (ArrayList<Integer>) o1.readObject();
         ArrayList <Integer> arr2 = (ArrayList<Integer>) o2.readObject();   
         TreeSet<Integer> se1 = new TreeSet<>();
         TreeSet<Integer> se2 = new TreeSet<>();
         for(Integer x : arr1){
             if(check(x)) se1.add(x);
         }
         for(Integer x : arr2){
             if(check(x)) se2.add(x);
         }
         for(Integer i : se1){
             if(i >= 1000000 - i) break;
             
             if(se2.contains(1000000 - i)){
                 System.out.println(i + " " + (1000000 - i));
             }
         }
         o1.close();
         o2.close();
    }
}