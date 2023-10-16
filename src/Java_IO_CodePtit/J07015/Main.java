package J07015;
import java.util.*;
import java.io.*;   
public class Main {
     static boolean check(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("SONGUYEN.in");
            ObjectInputStream obj  = new ObjectInputStream(f);
            ArrayList <Integer> a = (ArrayList<Integer>) obj.readObject();
            TreeMap <Integer, Integer> mp = new TreeMap<>();
            for(Integer x : a){
                if(check(x) ){
                    if( mp.containsKey(x)){
                        int tmp = mp.get(x) + 1;
                        mp.put(x, tmp);
                    }
                    else mp.put(x, 1);
                }
                
            }
            for(Map.Entry<Integer, Integer> e  : mp.entrySet()){
                    System.out.println(e.getKey() + " "  + e.getValue());
            }
            obj.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
