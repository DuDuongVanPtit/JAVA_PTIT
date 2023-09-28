/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class Bai11 {
    public static void main(String[] args) throws Exception{
        FileInputStream in = new FileInputStream("DATA.in");
        ObjectInputStream o = new ObjectInputStream(in);
        ArrayList<String> list = (ArrayList<String>) o.readObject();
        for(String s : list){
            String res = "";
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0' || s.charAt(i) == '1') res += s.charAt(i) + "";
            }
            long ans = Long.parseLong(res, 2);
            System.out.println(res + " " + ans);
        }
        o.close();
    }
}
