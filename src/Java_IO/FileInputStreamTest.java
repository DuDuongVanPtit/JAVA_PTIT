package Java_IO;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//FileInputStream
public class FileInputStreamTest {
    public static void main(String[] args) {
        String path = "E:\\3-NAM BA_2023-2024\\KI I\\JAVA_PTIT\\src\\Java_IO\\test.txt";
        try {
            FileInputStream f = new FileInputStream(path);
            try {
                int s;
                //if f.read() return -1 => this is the end of the file
                while((s = f.read()) != -1){
                    System.out.print((char)s);
                }
            } catch (IOException ex) {
                Logger.getLogger(FileInputStreamTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("file not found!");
            Logger.getLogger(FileInputStreamTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
