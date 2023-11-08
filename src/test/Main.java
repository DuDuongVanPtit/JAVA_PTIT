<<<<<<< HEAD
import java.io.*;
import java.text.*;
import java.util.*;

class LuuTru{
    public static int i = 1;
    private String mkh, name, ma;
    private Date den, di;
    public LuuTru(String name, String ma, String den, String di) throws ParseException {
        this.mkh = "KH" + String.format("%02d", i++);
        this.name = name;
        this.ma = ma;
        this.den = new SimpleDateFormat("dd/MM/yyyy").parse(den);
        this.di = new SimpleDateFormat("dd/MM/yyyy").parse(di);
    }
    public long getLuuTru() { 
        long k =(di.getTime() - den.getTime());
        long x = k /  (60 * 60 * 24 * 1000);
        return x;
    }
    public String toString() {
        return mkh + " " + name + " " + ma + " " + getLuuTru();
    }
}
public class J07046 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = sc.nextInt();
        sc.nextLine();
        List<LuuTru> list = new ArrayList<LuuTru>();
        while(t-- > 0){
            String name = sc.nextLine();
            String ma = sc.nextLine();
            String den = sc.nextLine();
            String di = sc.nextLine();
            LuuTru x = new LuuTru(name, ma, den, di);
            list.add(x);
        }
        Collections.sort(list, new Comparator<LuuTru>() {
            public int compare(LuuTru a, LuuTru b){
                return Long.compare(b.getLuuTru(), a.getLuuTru());
            }
        });
        for(LuuTru x : list){
            System.out.println(x);
        }
        sc.close();
    }
}
=======
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

class LoaiPhong implements Comparable<LoaiPhong> {
    private String s;
    private String loaiPhong;

    public LoaiPhong(String s) {
        this.s = s;
        this.loaiPhong = getS();
    }

    public String getS() {
        loaiPhong = s.split("\\s+")[1];
        return loaiPhong;
    }
    public int compareTo(LoaiPhong a) {
        return loaiPhong.compareTo(a.loaiPhong);
    }
    public String toString() {
        return s;
    }
}

public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    public static void main2473501(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds) {
            System.out.println(tmp);
        }
        in.close();
    }
}

>>>>>>> 8a0d6d54e60c896ad31a1c8a9f9f6b09d74d253c
