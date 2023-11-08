package Java_IO_CodePtit;

import java.io.*;
import java.util.*;

public class J07022 {
    public static boolean checkInt(String s){
        return s.matches("-?\\d+");
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new  File("//E:\\\\3-NAM BA_2023-2024\\\\KI I\\\\JAVA_PTIT\\\\src\\\\Java_IO_CodePtit\\\\DATA.in"));
        ArrayList <String> arr = new ArrayList<>();
        while(sc.hasNext()){
            String tmp = sc.next();
            if(checkInt(tmp) && tmp.length() > 10){
                arr.add(tmp);
            }
            else if(!checkInt(tmp)){
                arr.add(tmp);
            }
        }
        arr.sort((o1, o2) ->{
            return o1.compareTo(o2);
        });
        for(String x : arr){
            System.out.print(x + " ");
        }
    }
}
