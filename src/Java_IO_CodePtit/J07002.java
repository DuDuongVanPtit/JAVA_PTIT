package Java_IO_CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class J07002 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            long sum = 0;
            while(sc.hasNext()){
                String tmp = sc.next();
                if(tmp.length() < 10 && isNumber(tmp)){
                    sum += Integer.parseInt(tmp);
                }
            }
            System.out.println(sum);
            
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
        
    }
    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str); // or Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
