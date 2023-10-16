package TH2;
import java.util.*;
public class BAI5_LOG_THOI_GIAN {
    public static boolean check(String s){
        if(s.length() != 8) return false;
        if(s.charAt(2) != ':' || s.charAt(5) != ':') return false;
        for(int i = 0; i < 8; i++){
            if(i != 2 && i != 5 && Character.isDigit(s.charAt(i))) return false;    
        }   
        int h = Integer.parseInt(s.substring(0,2));
        int m = Integer.parseInt(s.substring(3,5));
        int S = Integer.parseInt(s.substring(6,8));
        return h < 24 && m < 60 && S < 60;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Set<String> se = new TreeSet<String>();
       while(sc.hasNext()){
           String s = sc.nextLine();
           String[] x = s.split("\\s|\\.|\\,");
           for(String i : x){
               if(check(i)){
                   se.add(i);
               }
           }
       }
       for(String i : se){
           System.out.println(i);
       }
    }
}
//[BeginLog]
//[Boot Session: 2023/01/31 10:22:00.500]
//09:50:44.356  WINWORD (0x43A4)
//Section 2023/01/31 10:22:16, 538new
//{FILE_QUEUE_COMMIT} 10:22:16.569
//Start: 14:17:50.111over
//End: 14:17:50.899over