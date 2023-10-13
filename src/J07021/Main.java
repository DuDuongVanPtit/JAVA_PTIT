/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07021;

/**
 *
 * @author Admin
 */
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNext()){
                String name = sc.nextLine().toLowerCase().trim();
                String [] words = name.split(" ");
                StringBuilder sb = new StringBuilder();
                for(String word : words){
                    sb.append(word.substring(0, 1).toUpperCase() + word.substring(1)  + " ");
                }
                System.out.println(sb);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
}
