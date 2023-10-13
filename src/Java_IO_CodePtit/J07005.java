package Java_IO_CodePtit;

import java.io.*;
import java.util.*;

public class J07005 {
    public static void main(String[] args) {
        try {
            FileInputStream f =
                    new FileInputStream("DATA.in");
            DataInputStream data = new DataInputStream(f);
            Map <Integer, Integer> h = new TreeMap<Integer, Integer>();
            while(data.available() > 0){
                int s = data.readInt();
                if(h.containsKey(s)){
                    int tmp = h.get(s) + 1;
                    h.put(s, tmp);
                }
                else{
                    h.put(s, 1);
                }
            }
            data.close();
            for(Map.Entry<Integer, Integer> e : h.entrySet()){
                System.out.println(e.getKey() + " " + e.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}