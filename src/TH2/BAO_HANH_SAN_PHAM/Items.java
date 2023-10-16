package TH2.BAO_HANH_SAN_PHAM;
public class Items {
    private String itemCode, itemName;
    private int price, warranty;
    public Items(String itemCode, String itemName, int price, int warranty) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.warranty = warranty;
    }
    public int getPrice(){
        return this.price;
    }
    public String getItemCode(){
        return this.itemCode;
    }
    public int getWarranty(){
        return this.warranty;
    }
}

