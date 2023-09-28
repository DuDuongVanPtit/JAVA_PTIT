package TH1;
import java.util.*;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();   
        String tmp1 = "", tmp2 = "";
        while(n-- > 0){
             String s1 = sc.nextLine().toLowerCase().trim();
             tmp1 += s1 + " ";
        } 
        int m = sc.nextInt();     
        sc.nextLine();
        while(m-- > 0){
            String s1 = sc.nextLine().toLowerCase().trim();
            tmp2 += s1 + " ";
            
        }
        List <String> a = Arrays.asList(tmp1.split("\\s+"));
        List <String> b = Arrays.asList(tmp2.split("\\s+"));
        Set <String> se1 = new TreeSet<>();
        Set <String> se2 = new TreeSet<>();
        for(String x : a){
               if(!b.contains(x)){
                   se1.add(x);
               }
        }
        for(String x : b){
               if(!a.contains(x)){
                   se2.add(x);
               }
        }
        for(String x : se1){
            System.out.print(x +  " ");
        }
        System.out.println();
        for(String x : se2){
            System.out.print(x + " ");
        }
    }
}
//2
//Lap trinh huong doi tuong
//ngon ngu lap trinh C++
//2
//lap trinh co ban
//lap trinh huong thanh phan