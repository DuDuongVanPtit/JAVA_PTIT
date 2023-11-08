package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyEvent extends  JFrame implements ActionListener{
    private JPanel p = new JPanel();
    private JComboBox<String> cb = new JComboBox<>();
    private JButton ok = new JButton("ok");
    public MyEvent(String title) throws HeadlessException{
        super(title);
        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);
        JPanel p1 = new JPanel();
        add(p1, BorderLayout.SOUTH);
        p1.setLayout(new FlowLayout());
        p1.add(cb);
        p1.add(ok);
        cb.addItem("xanh");
        cb.addItem("do");
        cb.addItem("tim");
        cb.addItem("vang");
        ok.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String s = cb.getSelectedItem().toString();
        if(s.equals("xanh")) p.setBackground(Color.BLUE);
        if(s.equals("do")) p.setBackground(Color.RED);
        if(s.equals("tim")) p.setBackground(Color.MAGENTA);
        if(s.equals("vang")) p.setBackground(Color.YELLOW);
    }
    
}
