/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STRING;
import java.util.*;
public class J03025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            int ans = 0;
            for(int i = 0; i < s.length() / 2; i++){
                if(s.charAt(i) != sb.charAt(i)) ans++;
            }
            if(ans > 1) System.out.println("NO");
            else if(ans == 0){
                if(s.length() % 2 == 0) System.out.println("NO");
                else System.out.println("YES");
            }
            else System.out.println("YES");
        }
    }
}
//3
//abccaa
//abbcca
//abcda