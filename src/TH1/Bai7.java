package TH1;
import java.util.*;
import java.io.*;

public class Bai7 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger bg = new BigInteger("0");
        
        while(sc.hasNextLine()){
            
        }
    }
    static List check(String s){
        long MAX = -10000;
        List <Long> arr = new ArrayList();
        for(char x : s.toCharArray()){
            String tmp = "0";
            if(Character.isDigit(x)){
                tmp += x;
            }
            else{
                MAX = Math.max(Long.parseLong(tmp), MAX);
                if(("" + MAX).length() > 9) arr.add(MAX);
                tmp = "0";
            }
        }
        return arr;
    }
}
