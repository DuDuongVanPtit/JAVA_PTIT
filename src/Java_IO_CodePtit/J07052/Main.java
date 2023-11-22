package Java_IO_CodePtit.J07052;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = sc.nextInt();
        ArrayList <Student> students = new ArrayList<>();
        sc.nextLine();
        while(t-- > 0){
            String code = sc.nextLine();
            String name = sc.nextLine();
            String mathScore = sc.nextLine();
            String physicScore = sc.nextLine();
            String chemistryScore = sc.nextLine();
            Student a = new Student(code, name, Double.parseDouble(mathScore), Double.parseDouble(physicScore), Double.parseDouble(chemistryScore));
            a.setName();
            a.setTotal();
            students.add(a);
        }
        students.sort((o1, o2) -> Double.compare(o2.getTotal(), o1.getTotal()));
        int admission = sc.nextInt();
        int cnt = 0;
        double diemchuan = 0;
        for(Student x : students){
            if(cnt == admission) break;
            diemchuan = x.getTotal();
            cnt++;
        }
        System.out.println(diemchuan);
        for(Student x  : students){
            System.out.print(x);
            if(x.getTotal() >= diemchuan) System.out.println(" TRUNG TUYEN");
            else System.out.println(" TRUOT");
        }
    }
}
//3
//KV3A001
//Duong VAN DU  
//9
//9
//9
//KV2A002
//Hoang THAnh tuan
//5
//6
//5
//KV3B123
// LY Thi   THU ha
//8
//6.5
//7
//1