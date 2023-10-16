package Java_IO_CodePtit.J07017;
import java.util.*;
public class Pair <T, V> {
    private T a;
    private V b;
    public Pair(T a, V b) {
        this.a = a;
        this.b = b;
    }
    public static boolean snt(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public boolean isPrime(){
        return snt((Integer)a) && snt((Integer)b);
    }
    @Override
    public String toString(){
        return a + " " + b;
    }
}

