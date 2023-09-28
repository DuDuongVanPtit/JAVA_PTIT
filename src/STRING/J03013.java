/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STRING;
import java.util.*;
import java.math.BigInteger;
public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            int MAX = Math.max(a.toString().length(), b.toString().length());
            String x = a.subtract(b).abs().toString();
            int tmp = MAX - a.subtract(b).abs().toString().length();
            while(tmp-- > 0){
                System.out.print("0");
            }
            System.out.println(a.subtract(b).abs());
        }
    }
}
//input
//2
//978
//12977
//100
//1000000
//output
//11999
//0999900 