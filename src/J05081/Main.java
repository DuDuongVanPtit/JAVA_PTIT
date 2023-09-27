package J05081;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Items> items = new ArrayList<Items>();
        int t = sc.nextInt();
        int dem = 1;
        while(t-- > 0){
            sc.nextLine();
            String ma = "";
            if(("" + dem).length() == 1) ma += "00" + ("" + dem);
            else if(("" + dem).length() == 2) ma += "0" + ("" + dem);
            else ma += ("" + dem);
            Items item = new Items(ma,sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt());
            items.add(item);
            dem++;
        }
        Collections.sort(items, new Comparator<Items>(){
            public int compare(Items a, Items b){
                if(a.getLoiNhuan() != b.getLoiNhuan()){
                    return b.getLoiNhuan() - a.getLoiNhuan();
                }
                return a.getMa() - b.getMa();
            }
        });
        for(Items x : items){
            x.show();
        }
    }
}
//3
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000
//Ao phong tre em
//Cai
//25000
//41000
