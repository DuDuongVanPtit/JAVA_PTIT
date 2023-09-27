/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J04006;
import java.util.*;
/**
 *
 * @author Admin
 */
public class SinhVien {
    Scanner sc = new Scanner(System.in);
    private String msv = "B20DCCN001", name, lop, ns;
    private float gpa;
    public SinhVien(){
        
    }
    public void nhap(){
        this.name = sc.nextLine();
        this.lop = sc.next();
        this.ns = sc.next();
        this.gpa= sc.nextFloat();
    }
    public void setNs(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.ns);
        if(sb.charAt(1) == '/') sb.insert(0, '0');
        if(sb.charAt(4) == '/') sb.insert(3,'0' );
        this.ns = sb.toString();
    }
    public void Show(){
        System.out.print(msv + " " + this.name + " " + this.lop + " " + this.ns );
        System.out.printf(" %.2f", this.gpa);
    }
}
