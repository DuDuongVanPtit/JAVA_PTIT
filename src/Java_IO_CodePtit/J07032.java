package Java_IO_CodePtit;
import java.util.*;
import java.io.*;

public class J07032 {
    public static boolean tn(int n){
        int dao = 0;
        int m = n;
        while(m > 0){
            dao = dao * 10 + m % 10;
            m /= 10;
        }
        if(dao == n){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean check(int n){
        int s = (""+n).length();
        if(s % 2 == 0 || s == 1) return false;
        while(n != 0){
            if((n % 10) % 2 == 0) return false;
            n /= 10;
        }
        return true;    
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream in1 = new FileInputStream("DATA1.in");
        FileInputStream in2 = new FileInputStream("DATA2.in");
        ObjectInputStream o1 = new ObjectInputStream(in1);
        ObjectInputStream o2 = new ObjectInputStream(in2);
        Map <Integer, Integer> mp = new TreeMap<>();
        ArrayList <Integer> arr1 = (ArrayList<Integer>) o1.readObject();
        ArrayList <Integer> arr2 = (ArrayList<Integer>) o2.readObject();
        for(Integer x  : arr1){
            if(check(x) && tn(x) && arr2.contains(x)){
                if(mp.containsKey(x)){
                    int tmp = mp.get(x);
                    tmp++;
                    mp.put(x, tmp);
                }
                else mp.put(x, 1);
            }
        }
        for(Integer x : arr2){
             if(mp.containsKey(x)){
                 int tmp = mp.get(x);
                 tmp++;
                 mp.put(x, tmp);
             }            
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
             System.out.println(entry.getKey() + " " + entry.getValue());
             count ++;
             if(count >= 10){
                 break;
             }
        }
    }
}