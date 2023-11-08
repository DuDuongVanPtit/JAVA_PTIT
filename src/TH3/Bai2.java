package TH3;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.*;
import java.util.*;

class CheckOnline{
    private String name;
    private Date start, end;
    public CheckOnline(String name, String start, String end) throws ParseException{
        this.name = name;
        this.start = new SimpleDateFormat("dd/MM/yyy HH:mm:ss").parse(start);
        this.end = new SimpleDateFormat("dd/MM/yyy HH:mm:ss").parse(end);
    }
    public long check(){
        Long x = start.getTime();
        Long y = end.getTime();
        return (y -  x)/(1000*60);
        
    }
    public String toString(){
        return name + " " + check();
    }
}
public class Bai2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<CheckOnline> list = new ArrayList<>();
        while(t-- > 0){
            String name = sc.nextLine();
            String start = sc.nextLine();
            String end = sc.nextLine();
            CheckOnline c = new CheckOnline(name, start, end);
            list.add(c);
        }
        list.sort((o1, o2) -> Long.compare(o2.check(), o1.check()));
        for(CheckOnline x : list){
            System.out.println(x);
        }
              
    }
}
