package test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Items> a = new ArrayList<Items>();
        int t = sc.nextInt();
        while(t-- > 0){
            sc.nextLine();
            Items tmp = new Items(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(tmp);
        }
        int n = sc.nextInt();
        while(n-- > 0){
            sc.nextLine();
            Invoice tmp = new Invoice();
        }
    }
  
}
