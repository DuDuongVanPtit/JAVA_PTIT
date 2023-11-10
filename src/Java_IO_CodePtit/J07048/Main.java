package Java_IO_CodePtit.J07048;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = sc.nextInt();
        ArrayList <Product> products = new ArrayList<>();
        while(t-- > 0){
            sc.nextLine();
            Product product = new Product(sc.nextLine(), sc.nextLine(), sc.nextInt(),sc.nextInt());
            products.add(product);
        }
        products.sort((o1, o2)->{
            if(o1.getPrice() != o2.getPrice()){
                return o2.getPrice() - o1.getPrice();
            }
            return o1.getCode().compareTo(o2.getCode());
        });
        for(Product product : products){
            System.out.println(product);
        }
    }
}
