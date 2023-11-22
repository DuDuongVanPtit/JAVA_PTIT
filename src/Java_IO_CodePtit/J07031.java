package Java_IO_CodePtit;
import java.util.*;
import java.io.*;

public class J07031 {
    public static boolean check(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
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
        Set <Integer> se1 = new TreeSet<>();
        Set <Integer> se2 = new TreeSet<>();
        for(Integer x : arr1){
            se1.add(x);
        }
        for(Integer x : arr2){
            se2.add(x);
        }
        for(Integer i : se1){
            if(i >= 1000000 - i) break;
            int tmp = 1000000 - i;
            if(check(i) && se1.contains(tmp) && check(tmp) && !se2.contains(i) && !se2.contains(tmp)){
                System.out.println(i +  " " + tmp);
            }
        }
    }
}