package Java_IO_CodePtit;

import java.io.*;
import java.util.*;

public class J07006 {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("DATA.in");
            ObjectInputStream obj = new ObjectInputStream(f);
            ArrayList<Integer> arr = (ArrayList<Integer>)obj.readObject();
            Map <Integer, Integer> h = new TreeMap<Integer, Integer>();
            for(Integer x : arr){
                if(h.containsKey(x)){
                    int tmp = h.get(x) + 1;
                    h.put(x, tmp);
                }
                else{
                    h.put(x, 1);
                }
            }
            obj.close();
            for(Map.Entry<Integer, Integer> e : h.entrySet()){
                System.out.println(e.getKey() + " " + e.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}