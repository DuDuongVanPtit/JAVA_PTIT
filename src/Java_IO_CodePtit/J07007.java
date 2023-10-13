package Java_IO_CodePtit;
import java.io.*;
import java.util.*;
public class J07007 {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
class WordSet {
    private Set<String> words;
    public WordSet(String file) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(file));
        words = new TreeSet<String>();
        while(sc.hasNext()){
            String tmp = sc.next().toLowerCase();
            words.add(tmp);
        }
        sc.close();
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("");
        for(String s : words){
            sb.append(s).append("\n");
        }
        return sb.toString();
    }
}
