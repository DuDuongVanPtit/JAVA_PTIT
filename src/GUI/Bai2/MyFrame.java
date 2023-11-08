package GUI.Bai2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyFrame extends JFrame implements ActionListener{
    private JComboBox gBox,numSideBox,categoryBox;
    private JLabel lblGeomery,lblNumSide,lblColor,categoryLabel;
    private JButton colorChooseBtn;
    private JButton drawBtn;
    private Color color = Color.BLUE;
    private int gIndex = 0;
    private int numSides = 3;
    private int categoryNumber = 0;
    MyFrame(){
        String[] geometries = {"Hình Tròn","Hình chữ nhật","Đa giác"};
        lblGeomery = new JLabel("Chọn hình:");
        lblGeomery.setBounds(50, 50, 150, 20);
        gBox = new JComboBox(geometries);
        gBox.setBounds(200, 50, 100, 20);
        gBox.addActionListener(this);
        String[] sides = {"3","4","5","6","7","8","9","10","11","12","13","14","15"};
        lblNumSide = new JLabel("Chọn số cạnh(Đa giác):");
        lblNumSide.setBounds(50, 100, 150, 20);
        numSideBox = new JComboBox(sides);
        numSideBox.setBounds(200, 100, 100, 20);
        numSideBox.addActionListener(this);
        lblColor = new JLabel("Chọn màu:");
        lblColor.setBounds(50, 150, 150, 20);
        colorChooseBtn = new JButton("Chọn Màu");
        colorChooseBtn.setBounds(200, 150, 150, 20);
        colorChooseBtn.addActionListener(this);
        categoryLabel = new JLabel("Chọn loại hình:");
        categoryLabel.setBounds(50, 200, 150, 20);
        String[] categories = {"Đặc","Rỗng"};
        categoryBox = new JComboBox(categories);
        categoryBox.setBounds(200, 200, 100, 20);
        categoryBox.addActionListener(this);
        
        drawBtn = new JButton();
        drawBtn.setText("Vẽ");
        drawBtn.setBounds(50, 250, 100, 20);
        drawBtn.addActionListener(this);
        this.add(lblGeomery);
        this.add(gBox);
        this.add(lblNumSide);
        this.add(numSideBox);
        this.add(lblColor);
        this.add(colorChooseBtn);
        this.add(categoryLabel);
        this.add(categoryBox);
        this.add(drawBtn);
        
        this.setTitle("Vẽ hình cơ bản");
        this.setLayout(null);
        this.setSize(500,400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == colorChooseBtn){
            JColorChooser colorChooser = new JColorChooser();
            color = JColorChooser.showDialog(null, "Pick a color", Color.yellow);
        }
        if(e.getSource() == gBox){
            gIndex = gBox.getSelectedIndex();
        }
        if(e.getSource() == numSideBox){
            numSides = Integer.parseInt((String) numSideBox.getSelectedItem());
        }
        if(e.getSource() == categoryBox){
            categoryNumber = categoryBox.getSelectedIndex();
        }
        if(e.getSource() == drawBtn){
            new DrawFrame(color,gIndex,numSides,categoryNumber);
            
        }
    }
}
