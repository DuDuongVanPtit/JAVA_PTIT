package test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet <Integer> tset = new TreeSet<>();
        TreeSet <Integer> tset1 = new TreeSet<>();
        tset.add(2);
        tset.add(5);
        tset.add(4);
        tset.add(5);
        tset.add(23);
        tset.add(24);
        tset.add(26);
        tset1.add(23);
        tset1.add(24);
        tset1.add(4);
        tset1.add(6);
        tset1.add(7);
        TreeSet <Integer> tset2 = new TreeSet<>();
        tset2.addAll(tset);
        tset2.addAll(tset1);
        System.out.println(tset2);
    }
}
