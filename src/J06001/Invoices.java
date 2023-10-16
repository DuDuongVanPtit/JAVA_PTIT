package J06001;
public class Invoices{
    private String invoice_code, invoice_name;
    private long amount, discount, pay;
    public Invoices(){
    }
    public void setDefaultInvoice(String invoice_code, long amount){
        this .invoice_code = invoice_code;
        this.amount = amount;
    }
    public String getInvoiceCode(){
        return this.invoice_code.substring(0, 3);
    }
    public void setInvoiceName(String invoiceName){
        this.invoice_name = invoiceName;
    }
    public void solvePrice(long price){
        this.pay = this.amount * price;
        this.discount = this.pay;
        if(this.amount >= 150){
            this.discount *= 0.5;
        }
        else if(this.amount >= 100){
            this.discount *= 0.3;
        }
        else if(this.amount >= 50){
            this.discount *= 0.15;
        }
        else this.discount = 0;
        this.pay -= this.discount;
    }
    public void outInvoice(){
        System.out.println(this.invoice_code + " " + this.invoice_name + " " + this.discount + " " + this.pay);
    }
}