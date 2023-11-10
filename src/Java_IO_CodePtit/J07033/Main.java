package Java_IO_CodePtit.J07033;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc;
        try {
            sc = new Scanner(new File("SINHVIEN.in"));
            int t = sc.nextInt();
            sc.nextLine();
            ArrayList <Student> students = new ArrayList<>();
            while(t-- > 0){
                Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
                a.setNewName();
                students.add(a);
            }
            students.sort((o1, o2)->{
                return o1.getCode().compareTo(o2.getCode());
            });
            for(Student student : students){
                System.out.println(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
