package Java_IO_CodePtit.J07050;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = sc.nextInt();
        ArrayList <Product> arr = new ArrayList <>();
        int c = 1;
        while(t-- > 0){
            sc.nextLine();
            Product p = 
                    new Product(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            String code = "";
            code += "MH";
            if(("" + c).length() < 2){
                code += "0";
            }
            code += ("" + c);
            c++;
            p.setCode(code);
            p.setProfit();
            arr.add(p);
        }
        
        arr.sort((o1, o2) -> 
            Double.compare(o2.getProfit(), o1.getProfit())
        );
        for(Product x : arr){
            System.out.println(x);
        }
    }
}
