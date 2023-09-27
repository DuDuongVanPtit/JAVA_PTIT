 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04002;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange A = new Rectange(sc.nextInt(), sc.nextInt(), sc.next());
        if(A.getWidth() > 0 && A.getHeight() > 0){
            System.out.printf("%d %d %s", A.chuvi(), A.dientich(), A.changeColor());
        }
        else{
            System.out.println("INVALID");
        }
    }
}
