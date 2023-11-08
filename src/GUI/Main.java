package GUI;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
       MyEvent f = new MyEvent("TestEvent");
        f.setSize(600, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
