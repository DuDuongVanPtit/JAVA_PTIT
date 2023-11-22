package Java_Colections_CodePtit;
import java.util.*;
public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            Map <Long, Integer> mp = new HashMap<>();
            long[] a = new long[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
                if(mp.containsKey(a[i])){
                    int x = mp.get(a[i]) + 1;
                    mp.put(a[i], x);
                }
                else{
                    mp.put(a[i], 1);
                }
            }
            long ans = 0L;
            for(long i : a){
                long x = k - i;
                if(mp.containsKey(x)){
                    if(x == i){
                        ans += (mp.get(x) - 1);
                    }
                    else{
                        ans += mp.get(x);
                    }
                }
            }
            System.out.println(ans/2);
        }
    }
}
