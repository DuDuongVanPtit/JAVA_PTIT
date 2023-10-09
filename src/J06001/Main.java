package J06001;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList <Invoices> a = new ArrayList<>();
        Map<String, Items> mpItems = new HashMap<>();
        while(t-- > 0){
            sc.nextLine();
            Items tmp = new Items(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            mpItems.put(tmp.getItemCode(), tmp);
        }
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            String tmp = sc.nextLine();
            String invoice_code  = tmp.substring(0, 3);
            int amount = Integer.parseInt(tmp.substring(4));
            Invoices iv = new Invoices();
            String stt = "" + i;
            while(stt.length() < 3){
                stt = "0" + stt;
            }
            iv.setDefaultInvoice(invoice_code + "-" + stt, amount);
            a.add(iv);
        }
        for(Invoices invoice : a){
            String code = invoice.getInvoiceCode().substring(0, 2);
            String type = invoice.getInvoiceCode().substring(2,3);
            Items tmp = mpItems.get(code);
            invoice.setInvoiceName(tmp.getItemName());
            if(type.compareTo("1") == 0){
                invoice.solvePrice(tmp.getPrice1());
            }
            else{
                invoice.solvePrice(tmp.getPrice2());
            }
        }
        for(Invoices invoice : a){
            invoice.outInvoice();
        }
    }
}
//2
//AT
//Ao thun
//80000
//45000
//QJ
//Quan Jean
//220000
//125000
//2
//AT1 95
//QJ2 105