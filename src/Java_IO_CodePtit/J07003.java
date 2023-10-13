package Java_IO_CodePtit;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class J07003 {
    public static void main(String[] args) {
        try {
            Scanner sc = 
                 new Scanner(new File("DATA.in"));
            String t = sc.nextLine();
            BigInteger init = new BigInteger(t);
            int size = init.toString().length();
            while(size > 1){
                String tmp = init.toString();
                String a = "", b = "";
                for(int i = 0; i < tmp.length() / 2; i++) a += tmp.charAt(i);
                for(int i = tmp.length()/2; i < tmp.length(); i++) b += tmp.charAt(i);
                BigInteger bg = new BigInteger(a);
                BigInteger bg1 = new BigInteger(b);
                init  = bg.add(bg1);
                size = init.toString().length();
                System.out.println(init);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
        
    }
}
