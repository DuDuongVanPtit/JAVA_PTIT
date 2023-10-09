package test;
public class Invoice extends Items{
    private String ma_invoice;
    private int amount;

    public Invoice(String ma_invoice, int amount, String ma, String ten, int price1, int price2) {
        super(ma, ten, price1, price2);
        this.ma_invoice = ma_invoice;
        this.amount = amount;
    }
    
}
