package Java_IO_CodePtit.J07033;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("//E:\\\\3-NAM BA_2023-2024\\\\KI I\\\\JAVA_PTIT\\\\src\\\\Java_IO_CodePtit\\\\DATA.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList <Student> students = new ArrayList<>();
        while(sc.hasNextLine()){
            Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            String[] originalName = a.getName().toLowerCase().split("\\s+");
            StringBuilder newName = new StringBuilder("");
            for(String x : originalName){
                newName.append(Character.toUpperCase(x.charAt(0)));
                newName.append(x.substring(1));
                newName.append(" ");
            }
            a.setName(newName.toString());
            students.add(a);
        }
        for(Student student : students){
            System.out.println(student);
        }
    }
}
