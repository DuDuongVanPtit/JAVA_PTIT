/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STRING;
import java.util.*;
public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            String s1 = sc.next();
            int MAX = Math.max(s.length(), s1.length());
            if(s.compareTo(s1) != 0) System.out.println(MAX);
            else System.out.println("-1");
        }
    }
}
//2
//abcd
//defgh
//a
//a
