package J06001;
public class Items {
   private String item_code, item_name;
   private long price1, price2;
   public Items(String item_code, String item_name, long price1, long price2) {
       this.item_code = item_code;
       this.item_name = item_name;
       this.price1 = price1;
       this.price2 = price2;
   }
  public String getItemCode(){
      return this.item_code;
  }
  public long getPrice1(){
      return this.price1;
  }
  public long getPrice2(){
      return this.price2;
  }
  public String getItemName(){
      return this.item_name;
  }
}
