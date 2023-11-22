package Java_IO_CodePtit;
import java.util.*;
import java.io.*;
public class J07029 {
    public static boolean Check(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream in = new FileInputStream("DATA.in");
        ObjectInputStream o = new ObjectInputStream(in);
        ArrayList <Integer> arr = (ArrayList<Integer>) o.readObject();
            //ArrayList<Integer> arr = new ArrayList<>();
            //Scanner sc = new Scanner(new File("D:\\3-NAM_BA_2023-2024\\JAVA_PTIT\\src\\Java_IO_CodePtit\\DATA.in"));
//            while(sc.hasNext()){
//                arr.add(sc.nextInt());
//            }
        Map <Integer, Integer> mp = new HashMap<>();
        for(Integer x : arr){
            if(Check(x)){
                if(mp.containsKey(x)){
                    int cnt = mp.get(x) + 1;
                    mp.put(x, cnt);
                }
                else{
                    mp.put(x, 1);
                }
            }
        }
        int c = 0;
       ArrayList< Map.Entry<Integer, Integer>> entryList = new ArrayList<>(mp.entrySet());
       entryList.sort((o1, o2) -> {
           return o2.getKey()-o1.getKey();
       });
        for(Map.Entry<Integer, Integer> entry : entryList){
            System.out.println(entry.getKey() + " " + entry.getValue());
            c++;
            if(c == 10) break;
        }
    }
}
