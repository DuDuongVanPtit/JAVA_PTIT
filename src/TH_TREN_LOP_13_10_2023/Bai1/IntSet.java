/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH_TREN_LOP_13_10_2023.Bai1;

/**
 *
 * @author Admin
 */
import java.util.*;
public class IntSet {
    private TreeSet <Integer> a;
    public IntSet(){
        
    }
    public IntSet(int[] x){
        for(int i : x){
            a.add(i);
    }
    public IntSet union(IntSet o){
            IntSet tmp = new IntSet();
            tmp.a.addAll(this.a);
            tmp.a.addAll(o.a);
            return tmp;
     }
        public String toString(){
            String s = "";
            for(Integer i : a){
                if(s.isEmpty()) s = Integer.toString(i);
                else s = s + " " + i;
            }
            return s;
        }
    }
}
