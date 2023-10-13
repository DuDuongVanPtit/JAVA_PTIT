/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH_TREN_LOP_13_10_2023;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set <Integer> s1 = new TreeSet<>();
        Set<Integer> s1Ans = new TreeSet<>();
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            s1.add(a[i]);
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            if(s1.contains(b[i])){
                s1Ans.add(b[i]);
            }
        }
        for(Integer x : s1Ans){
            System.out.println(x);
        }
        
    }
}
//5 6
//1 2 3 4 5
//3 4 5 6 7 8