package J06001;
public class Invoices{
    private String invoice_code, invoice_name;
    private int amount, discount, pay;
    public Invoices(){
    }
    public void setDefaultInvoice(String invoice_code, int amount){
        this .invoice_code = invoice_code;
        this.amount = amount;
    }
    public String getInvoiceCode(){
        return this.invoice_code.substring(0, 3);
    }
    public void setInvoiceName(String invoiceName){
        this.invoice_name = invoiceName;
    }
    public void solvePrice(int price){
        this.pay = this.amount * price;
        if(this.amount >= 150){
            this.discount = (int) (this.pay * 0.5);
        }
        else if(this.amount >= 100){
            this.discount = (int) (this.pay * 0.3);
        }
        else{
            this.discount = (int) (this.pay * 0.15);
        }
        this.pay -= this.discount;
    }
    public void outInvoice(){
        System.out.println(this.invoice_code + " " + this.invoice_name + " " + this.discount + " " + this.pay);
    }
}
