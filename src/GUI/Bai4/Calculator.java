package GUI.Bai4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{

    private JTextField textfield,subTextfield;
    private JButton[] numberButtons = new JButton[10];
    private JButton[] functionButtons = new JButton[10];
    private JButton addButton,subButton,mulButton,divButton;
    private JButton decButton, equButton,delButton,acButton,powButton,sqrtButton;
    private JPanel panel;
    private Font myFont = new Font("Arial",Font.PLAIN,30);
    private double num1=0,num2=0,result=0;
    private char operator = 'x';
    Calculator(){
        this.setTitle("Calculator");
        this.setSize(540, 600);
        this.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 420, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);

        subTextfield = new JTextField();
        subTextfield.setBounds(50, 100, 420, 30);
        subTextfield.setFont(myFont);
        subTextfield.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        acButton = new JButton("AC");
        powButton = new JButton("^");
        sqrtButton = new JButton("sqrt");


        functionButtons[0] = delButton;
        functionButtons[1] = acButton;
        functionButtons[2] = powButton;
        functionButtons[3] = sqrtButton;
        functionButtons[4] = addButton;
        functionButtons[5] = subButton;
        functionButtons[6] = mulButton;
        functionButtons[7] = divButton;
        functionButtons[8] = decButton;
        functionButtons[9] = equButton;

        for(int i =0;i<10;i++) {
                functionButtons[i].addActionListener(this);
                functionButtons[i].setFont(myFont);
                functionButtons[i].setFocusable(false);
        }

        for(int i =0;i<10;i++) {
                numberButtons[i] = new JButton(String.valueOf(i));
                numberButtons[i].addActionListener(this);
                numberButtons[i].setFont(myFont);
                numberButtons[i].setFocusable(false);
        }

        panel = new JPanel();
        panel.setBounds(50, 150, 420, 460);
        panel.setLayout(new GridLayout(6,4,10,10));
        panel.add(delButton);
        panel.add(acButton);
        panel.add(powButton);
        panel.add(sqrtButton);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        this.add(subTextfield);
        this.add(panel);
        this.add(textfield);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<10;i++) {
            if(e.getSource() == numberButtons[i]) {
                textfield.setText(textfield.getText() + String.valueOf(i));
            }
        }
        if(e.getSource()==decButton) {
            if(textfield.getText().length() == 0){
                textfield.setText("0.");
            }
            else{
                textfield.setText(textfield.getText() + ".");
            }
        }
        try{
            if(e.getSource()==addButton && textfield.getText().toString().length() != 0 ) {
                num1 = Double.parseDouble(textfield.getText());
                operator ='+';
                subTextfield.setText(num1 + " + ");
                textfield.setText("");
            }
            if(e.getSource()==subButton) {
                if(textfield.getText().toString().length() == 0){
                    textfield.setText("-");
                }
                else{
                    num1 = Double.parseDouble(textfield.getText());
                    operator ='-';
                    subTextfield.setText(num1 + " - ");
                    textfield.setText("");
                }
            }
            if(e.getSource()==mulButton && textfield.getText().toString().length() != 0) {
                num1 = Double.parseDouble(textfield.getText());
                operator ='*';
                subTextfield.setText(num1 + " * ");
                textfield.setText("");
            }
            if(e.getSource()==divButton && textfield.getText().toString().length() != 0) {
                num1 = Double.parseDouble(textfield.getText());
                operator ='/';
                 subTextfield.setText(num1 + " / ");
                textfield.setText("");
            }
            if(e.getSource() == powButton && textfield.getText().toString().length() != 0){
                num1 = Double.parseDouble(textfield.getText());
                operator ='^';
                subTextfield.setText(num1 + "^");
                textfield.setText("");
            }
            if(e.getSource() == sqrtButton && textfield.getText().toString().length() != 0){
                num1 = Double.parseDouble(textfield.getText());
                textfield.setText(String.format("%.3f", Math.sqrt(num1)));
                subTextfield.setText( "sqrt(" + num1 + ") = " + String.format("%.3f", Math.sqrt(num1)));
            }
        }
        catch(Exception ex){
            textfield.setText("ERROR");
            subTextfield.setText("ERROR");
        }
        if(e.getSource()==equButton) {
            try{
                num2=Double.parseDouble(textfield.getText());
                subTextfield.setText(subTextfield.getText().toString() + num2);
                if(operator == '+'){
                    result=num1+num2;
                }
                if(operator == '-'){
                    result=num1-num2;
                }
                if(operator == '*'){
                    result=num1*num2;
                }
                if(operator == '/'){
                    result=num1/num2;
                }
                if(operator == '^'){
                    result=Math.pow(num1, num2);
                }
                if(operator == 'x'){
                    result = num2;
                    if(result == (int)result){
                        textfield.setText((int)num2+"");
                        subTextfield.setText((int)num2+"");
                    }
                    else{
                        textfield.setText(num2+"");
                        subTextfield.setText(num2+"");
                    }
                }
                else{
                    if(result == (int)result){
                        textfield.setText((int)result+"");
                        subTextfield.setText(subTextfield.getText().toString() + " = " + (int)result);
                    }
                    else{
                        textfield.setText(result+"");
                        subTextfield.setText(subTextfield.getText().toString() + " = " + result);
                    }
                }
                num1=result;
            }
            catch(Exception ex){
                textfield.setText("ERROR");
                subTextfield.setText("ERROR");
            }
            operator = 'x';
        }
        if(e.getSource() == delButton){
            String txtDisplay = textfield.getText().toString();
            if(txtDisplay.length() > 0){
                textfield.setText(txtDisplay.substring(0,txtDisplay.length()-1));
            }
        }
        if(e.getSource() == acButton){
            textfield.setText("");
            subTextfield.setText("");
        }
    }
}

