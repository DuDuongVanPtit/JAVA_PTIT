package TH2.BAI7_DANH_SACH_LIEN_LAC;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List <SinhVien> arr = new ArrayList<>();
        while(sc.hasNext()){
            SinhVien tmp = 
                 new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), "0" + sc.nextLine());
            arr.add(tmp);
        }
        arr.sort((o1, o2) -> {
            if(o1.getClassName().compareTo(o2.getClassName()) != 0){
                return o1.getClassName().compareTo(o2.getClassName());
            }
            return o1.getCode().compareTo(o2.getCode());
        });
        for(SinhVien x : arr){
            System.out.println(x);
        }
    }
}
