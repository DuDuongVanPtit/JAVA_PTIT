package Java_IO_CodePtit.J07048;
public class Product {
    private String code, name;
    private int price, warranty;

    public Product(String code, String name, int price, int warranty) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }
    public int getPrice(){
        return this.price;
    }
    public String getCode(){
        return this.code;
    }
    public String toString(){
        return this.code + " " + this.name + " " + this.price + " " + this.warranty;
    }
}
