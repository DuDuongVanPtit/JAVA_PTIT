/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STRING;
import java.util.*;
public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
           String s1 = sc.nextLine();
           String s2 = sc.nextLine();
           List <String> a = Arrays.asList(s1.split("\\s+"));
           List <String> b = Arrays.asList(s2.split("\\s+"));
           Set <String> se = new HashSet<>();
           for(String x : a){
               if(!b.contains(x)){
                   se.add(x);
               }
           }
           for(String x : se){
               System.out.print(x + " ");
           }
            System.out.println();
        }
    } 
}