/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1.Bai6;

/**
 *
 * @author PC
 */
public class Items {
    private String nameItem,codeItem, stt = "";
    private int price, amount, discount;

    public Items(String nameItem, String codeItem, int price, int amount) {
        this.nameItem = nameItem;
        this.codeItem = codeItem;
        this.price = price;
        this.amount = amount;
    }
    public void solve(){
        String tmp = this.nameItem;
        if(tmp.charAt(tmp.length() - 1) == '1') this.discount = (int) (0.5 * this.price * this.amount);
        else this.discount = (int) (0.3 * this.price * this.amount);
        StringBuilder sb = new StringBuilder("");
        sb.append(this.codeItem.charAt(1));
        sb.append(this.codeItem.charAt(2));
        sb.append(this.codeItem.charAt(3));
        this.stt += sb.toString();
        int x = this.price;
        this.price = x * this.amount - this.discount;
    }
    public void show(){
        System.out.println(this.nameItem + " " + this.codeItem + " " + this.stt + " " + this.discount + " " + this.price);
    }
}
