package Java_IO_CodePtit.J07050;
public class Product {
    private String code, name,type;
    private double purchasePrice, price, profit;

    public Product(String name, String type,double purchasePrice,double price) {
        this.name = name;
        this.type = type;
        this.purchasePrice = purchasePrice;
        this.price = price;
    }
    public void setCode(String code){
        this.code = code;
    }
    public void setProfit(){
        this.profit = this.price - this.purchasePrice;
    }
    public double getProfit(){
        return this.profit;
    }
    public String toString(){
        return this.code + " " + this.name + " " + this.type + " " + String.format("%.2f", this.profit);
    }
    
}
