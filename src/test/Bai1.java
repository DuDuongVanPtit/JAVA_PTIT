package test;
import java.util.*;
import java.io.*;
public class Bai1 {
    public static boolean check(String s){
        return s.chars().anyMatch(Character::isDigit);
    }
    public static boolean check1(String s){
        return s.matches(".*[.,!?:].*");
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set <String> se = new TreeSet<>();
        while(sc.hasNext()){
            String tmp = sc.next();
            if(check(tmp) && !check1(tmp)) se.add(tmp);
        }
        for(String x : se){
            System.out.println(x);
        }
    }
}
