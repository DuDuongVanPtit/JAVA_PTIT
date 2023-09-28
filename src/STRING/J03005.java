/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STRING;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class J03005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
           String s = sc.nextLine().trim().toLowerCase();
           StringBuilder sb = new StringBuilder("");
           String[] arr = s.split("\\s+");
           for(int i = 1; i < arr.length; i++){
               sb.append(Character.toUpperCase(arr[i].charAt(0)));
               sb.append(arr[i].substring(1) + " ");
           }
           sb.delete(sb.length() -1, sb.length());
           sb.append(", " + arr[0].toUpperCase());
            System.out.println(sb);
        }
    }
}