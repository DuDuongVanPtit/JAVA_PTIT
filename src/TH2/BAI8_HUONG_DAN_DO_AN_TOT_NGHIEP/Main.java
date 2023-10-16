package TH2.BAI8_HUONG_DAN_DO_AN_TOT_NGHIEP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        Map<String, SinhVien> mp = new HashMap<>();
        while(sc.hasNext()){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            mp.put(sv.getCode(), sv);
        }
        ArrayList <DoAn> arr = new ArrayList<>();
        sc = new Scanner(new File("HUONGDAN.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String[] s = sc.nextLine().split("\\s+");
            String gv = "";
            for(int id = 0; id < s.length; id++){
                gv += s[id]+ " ";
            }
            int s1 = Integer.parseInt(s[s.length - 1]);
            for(int j = 0; j < s1; j++){
                String[] a = sc.nextLine().split("\\s+");
                String msv = a[0];
                String chude = "";
                for(int k = 1; k < a.length; k++){
                    chude += a[k] + " ";
                }
                arr.add(new DoAn(mp.get(msv), gv, chude));
            }
        }
        arr.sort((o1, o2) -> {
            return o1.getMsv().compareTo(o2.getMsv());
        });
        for(DoAn i : arr){
            System.out.println(i);
        }
    }
}
