package TH2.BAO_HANH_SAN_PHAM;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("MUAHANG.in"));
            int t = sc.nextInt();
            Map <String, Items> items = new HashMap<>();
            while(t-- > 0){
                sc.nextLine();
                Items item = new Items(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
                items.put(item.getItemCode(), item);
            }
            List <Customers> c = new ArrayList<>();
            int n = sc.nextInt();
            sc.nextLine();
            while(n-- > 0){
                String name = sc.nextLine();
                String adress = sc.nextLine();
                String codeItem = sc.nextLine();
                int amount = sc.nextInt();
                sc.nextLine();
                String buyDate = sc.nextLine();
                Customers customer = new Customers(name, adress, codeItem, amount, buyDate);
                c.add(customer);
            }
            int cnt = 1;
            for(Customers i : c){
                String code = "";
                code += ""+cnt;
                if(code.length() < 4) code = "0" + code;
                i.setCode("KH" + code);
                Items tmp = items.get(i.getCodeItem());
                i.solve(tmp.getPrice(), tmp.getWarranty());
                cnt++;
                
            } 
            c.sort((o1, o2) -> {
                if(o1.getNam() != o2.getNam()){
                    return o1.getNam() - o2.getNam();
                }
                else if(o1.getThang() != o2.getThang()){
                    return o1.getThang() - o2.getThang();
                }
                else if(o1.getNgay() != o2.getNgay()){
                    return o1.getNgay() - o2.getNgay();
                }
                else{
                    return o1.getCode().compareTo(o2.getCode());
                }
            });
            for(Customers i : c){
                System.out.println(i);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
}
