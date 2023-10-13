package Java_IO_Learn;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BufferedInputStreamTest {
    public static void main(String[] args) {
        FileInputStream f = null;
        BufferedInputStream b = null;
        try {
            f = new FileInputStream("E:\\3-NAM BA_2023-2024\\KI I\\JAVA_PTIT\\src\\Java_IO\\test.txt");
            b = new BufferedInputStream(f);
            int i;
            while ((i = b.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("file not found");
        } catch (IOException ex) {
            System.out.println("file not found1");
        }
    }
}
