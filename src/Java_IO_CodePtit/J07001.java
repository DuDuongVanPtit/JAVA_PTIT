package Java_IO_CodePtit;
//E:\\3-NAM BA_2023-2024\\KI I\\JAVA_PTIT\\src\\Java_IO_CodePtit\\DATA.in
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class J07001 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            while(sc.hasNextLine()){
                String tmp = sc.nextLine();
                System.out.println(tmp);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }
        
    }
}
