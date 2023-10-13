package Java_IO_CodePtit.J07010;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("SV.in"));
            int t = sc.nextInt();
            ArrayList <SinhVien> a = new ArrayList<>();
            while(t-- > 0){
                sc.nextLine();
                SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
                a.add(sv);
            }
            String code = "B20DCCN";
            int cnt = 1;
            for(SinhVien x : a){
                String birth = x.getBith();
                StringBuilder sb = new StringBuilder(birth);
                if(sb.charAt(1) ==  '/') sb.insert(0, '0');
                if(sb.charAt(4) == '/') sb.insert(3, '0');
                x.setBirth(sb.toString());
                String c = "";
                c += "" + cnt;
                while(c.length() < 3) c = "0" + c;
                System.out.print(code + c + " ");
                x.Out();
                cnt++;
            }
            
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
            System.out.println("File Not Found");
        }
    }
}
