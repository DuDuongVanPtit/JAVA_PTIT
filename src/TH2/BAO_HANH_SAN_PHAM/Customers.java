package TH2.BAO_HANH_SAN_PHAM;
public class Customers {
    private String code, name, adress, codeItem, buyDate, warrantyDate;
    private int amount, pay, ngay, thang, nam;
    public Customers(String name, String adress, String codeItem,int amount, String buyDate) {
        this.name = name;
        this.adress = adress;
        this.codeItem = codeItem;
        this.buyDate = buyDate;
        this.amount = amount;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public String getCodeItem(){
        return this.codeItem;
    }
    public void solve(int price, int warranty){
        this.pay = this.amount * price;
        int year = warranty / 12;
        int month = warranty % 12;
        StringBuilder sb = new StringBuilder();
        String a[] = this.buyDate.split("/");
        if(year > 0){
            int y = Integer.parseInt(a[2]) + year;
            a[2] = ""+y;
        }
        if(month > 0){
            int m = Integer.parseInt(a[1]) + month;
            if(m > 12){
                int tmp = Integer.parseInt(a[2]) + 1;
                a[2] = ""+tmp;
                m %= 12;
                if(m == 0){
                    a[1] = "12";
                }
                else a[1] = ""+m;
            } 
            else{
                a[1] = "" + m;
            }
        }
        sb.append(a[0] + '/'+ a[1] + '/' + a[2]);
        if(sb.charAt(1) == '/') sb.insert(0, '0');
        if(sb.charAt(4) == '/') sb.insert(3, '0');
        this.warrantyDate = sb.toString();
    }
    public int getNgay(){
        return Integer.parseInt(this.warrantyDate.substring(0, 2));
    }
    public int getThang(){
        return Integer.parseInt(this.warrantyDate.substring(3, 5));
    }
    public int getNam(){
        return Integer.parseInt(this.warrantyDate.substring(6));
    }
    @Override
    public String toString(){
        String s = "";
        s = s + code + " " + name + " " + adress + " " + codeItem + " " + pay + " " + warrantyDate;
        return s;
    }
}
