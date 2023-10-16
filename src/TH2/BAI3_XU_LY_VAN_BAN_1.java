package TH2;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class BAI3_XU_LY_VAN_BAN_1 {
    public static boolean check(String s){
        return s.chars().anyMatch(Character::isDigit);
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set <String> se = new TreeSet<>();
        while(sc.hasNext()){
            String tmp = sc.next();
            if(!check(tmp)) se.add(tmp);
        }
        for(String x : se){
            System.out.println(x);
        }
    }
}
