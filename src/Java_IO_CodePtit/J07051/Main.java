package Java_IO_CodePtit.J07051;
<<<<<<< HEAD
import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = sc.nextInt();
        
    }
}
=======
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList <Customer> customers = new ArrayList<>();
        int t =  sc.nextInt();
        int cnt = 1;
        while(t-- > 0){
            sc.nextLine();
            Customer a = new Customer(sc.nextLine(), sc.next(), sc.next(), sc.next(), sc.nextInt());
            String checkInStr = a.getCheckIn();
            String checkOutStr =  a.getCheckOut();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date checkIn = dateFormat.parse(checkInStr);
            Date checkOut = dateFormat.parse(checkOutStr);
            long ms = checkOut.getTime() - checkIn.getTime();
            long days = ms/(24 * 60 * 60 * 1000);
            a.setStayDay(days);
             String code = "";
            code += cnt;
            if(code.length() < 2){
                code = 0 + code;
            }
            code = "KH" + code;
            a.setCode(code);
            a.setName();
            a.setTotal();
            customers.add(a);
            cnt++;
        }
        customers.sort((o1, o2) -> Long.compare(o2.getTotal(), o1.getTotal()));
        for(Customer x : customers){
            System.out.println(x);
        }
    }
}
//3
//Huynh VAN Thanh   
//103 
//5/6/2010   
//5/6/2010   
//15
//le   DUC cong  
//106 
//08/3/2010   
//1/5/2010   
//220
//Tran Thi Bich Tuyen   
//207 
//10/4/2010   
//21/4/2010   
//96
>>>>>>> 8392c578cc8681ef3fd8a4c194e297817aab9672
