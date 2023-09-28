/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STRING;

/**
 *
 * @author PC
 */
import java.util.*;
public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- > 0){
            String s = sc.next();
            List <Character> s1 = new ArrayList<Character>();
            for(int i = 0; i < s.length(); i++){
                if(s1.size() == 0) s1.add(s.charAt(i));
                else{
                    if(s1.get(s1.size() - 1) == s.charAt(i)){
                        s1.remove(s1.size() - 1);
                    }
                    else s1.add(s.charAt(i));
                }
            }
            if(s1.size() == 0) System.out.println("Empty String");
            else{
                for(Character x : s1){
                    System.out.print(x);
                }
            }
        }
    }
}
//aaabccddd