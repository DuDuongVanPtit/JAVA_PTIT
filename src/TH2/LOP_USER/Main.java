package TH2.LOP_USER;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map <String, UserInfo> mp = new HashMap<>();
        Map <String, Integer> ans = new HashMap<>();
        List <String> arr = new ArrayList<>();
        sc.nextLine();
        while(n-- > 0){
            String[] info = sc.nextLine().split(" ");
            UserInfo tmp = new UserInfo(info[0], info[1]);
            mp.put(tmp.getUserName(), tmp);
            ans.put(info[0], 0);
            arr.add(info[0]);
        }
        int m = sc.nextInt();
        sc.nextLine();
        while(m-- > 0){
            String[] info = sc.nextLine().split(" ");
            if(mp.containsKey(info[0])){
                if(mp.get(info[0]).getUserPassword().equals(info[1])){
                    int tmp = ans.get(info[0]) + 1;
                    ans.put(info[0], tmp);
                }
            }
        }
        for(String x : arr){
            System.out.print(ans.get(x) + " ");
        }
    }
}
//4
//tendangnhap matkhau
//username password
//nguoidung m4tkh4un4yr4tb40m4t
//user2 password
//6
//tendangnhap matkhau
//username matkhau
//bfc34 contest
//username password
//tendangnhap matkhau
//user2 password
