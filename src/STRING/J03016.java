/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STRING;
import java.math.BigInteger;
import java.util.*;
public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            BigInteger bg = new BigInteger(s);
            BigInteger bg11 = new BigInteger("11");
            BigInteger bg0 = new BigInteger("0");
            if(bg.mod(bg11).equals(bg0)){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
