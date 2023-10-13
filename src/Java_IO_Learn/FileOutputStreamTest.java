package Java_IO_Learn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try {   
            FileOutputStream out =
                    new FileOutputStream("E:\\3-NAM BA_2023-2024\\KI I\\JAVA_PTIT\\src\\Java_IO\\test.txt");
            String str = "learn java IO";
            out.write(str.getBytes());
            out.flush();
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
