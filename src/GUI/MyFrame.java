package GUI;
import javax.swing.*;
import java.awt.*;
public class MyFrame extends Frame {
    public MyFrame(String title) throws HeadlessException{
        super(title);
        setLayout(new BorderLayout());
        add(new JButton("food to be placed here"), BorderLayout.WEST);
        JPanel p1 = new JPanel();
        add(p1, BorderLayout.CENTER);
        
        p1.setLayout(new BorderLayout());
        p1.add(new JTextField("Time to be displayed here"),  BorderLayout.EAST);
        JPanel p2 = new JPanel();
        p1.add(p2, BorderLayout.CENTER);
        p2.setLayout(new GridLayout(4,3));
        for(int i = 1; i <= 9; i++){
            p2.add(new JButton("" + i));
        }
        p2.add(new JButton("0"));
        p2.add(new JButton("Start"));
        p2.add(new JButton("Stop"));
    }

    void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
