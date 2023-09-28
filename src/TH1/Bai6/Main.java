/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1.Bai6;
import java.util.*;
/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List <Items> items = new ArrayList<Items>();
        while(t-- > 0){
            sc.nextLine();
            Items x = new Items(sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt());
            items.add(x);
        }
        for(Items x : items){
            x.solve();
            x.show();
        }
    }
}
class Items {
    private String nameItem,codeItem, stt = "";
    private int price, amount, discount;

    public Items(String nameItem, String codeItem, int price, int amount) {
        this.nameItem = nameItem;
        this.codeItem = codeItem;
        this.price = price;
        this.amount = amount;
    }
    public void solve(){
        String tmp = this.codeItem;
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
//3
//Kaki 2
//K0252
//80000
//15
//Jean 1
//J2011
//200000
//24
//Jean 2
//J0982
//150000
//12