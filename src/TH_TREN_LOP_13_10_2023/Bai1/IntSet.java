package TH_TREN_LOP_13_10_2023.Bai1;
import java.util.*;
public class IntSet {
    private TreeSet <Integer> set = new TreeSet<>();
    public IntSet(){}
    public IntSet(int[] x){
        for(int i : x){
            set.add(i);
        }
    }
    public IntSet union(IntSet o){
        IntSet tmp = new IntSet();
        tmp.set.addAll(this.set);
        tmp.set.addAll(o.set);
        return tmp;
    }
    public String toString(){
        String s = "";
        for(Integer i : set){
            s = s + " " + i.toString();
        }
        return s.trim();
    }
}
