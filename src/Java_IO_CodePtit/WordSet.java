package Java_IO_CodePtit;
import java.util.*;
import java.io.*;
public class WordSet {
    private Set<String> words;
    public WordSet(String file) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(file));
        words = new TreeSet<String>();
        while(sc.hasNext()){
            String tmp = sc.next();
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
