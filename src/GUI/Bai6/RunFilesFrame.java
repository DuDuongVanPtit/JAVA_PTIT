package GUI.Bai6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RunFilesFrame extends JFrame implements ActionListener {
    private JTextArea inputTextArea;
    private JTextArea outputTextArea;
    private JButton runButton;
    private JComboBox<String> problemComboBox;
    private ArrayList<String> problems;

    public RunFilesFrame() {
        // Set up the main frame with a BorderLayout
        setTitle("File Runner");
        setSize(600, 400); // Increased size
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create the "Input" panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        JLabel inputLabel = new JLabel("INPUT");
        inputTextArea = new JTextArea(3, 10);
        inputPanel.add(inputLabel, BorderLayout.NORTH);
        inputPanel.add(inputTextArea, BorderLayout.CENTER);

        // Create the "Run" button
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));


        runButton = new JButton("RUN");
        runButton.setFont(new Font("Arial", Font.BOLD, 14)); // Reduce font size
        runButton.setBackground(new Color(0, 153, 51)); // Set a custom background color
        runButton.setForeground(Color.WHITE); // Set text color
        runButton.setFocusPainted(false); // Remove the border around the text

        runButton.addActionListener(this);

        // Set a preferred size for the button
        Dimension buttonSize = new Dimension(100, 40);
        runButton.setPreferredSize(buttonSize);

        buttonPanel.add(runButton, BorderLayout.CENTER); // Center the button


        // Create the ComboBox with problem options
        problems = new ArrayList<>();
        problems.add("J01001 - HÌNH CHỮ NHẬT");
        problems.add("J01002 - TÍNH TỔNG N SỐ NGUYÊN DƯƠNG ĐẦU TIÊN");
        problems.add("J01004 - SỐ NGUYÊN TỐ");
        problems.add("J03004 - CHUẨN HÓA XÂU HỌ TÊN - 1");
        problems.add("J02011 - SẮP XẾP CHỌN");
        
        problemComboBox = new JComboBox<>(new DefaultComboBoxModel<>(problems.toArray(new String[0])));
        buttonPanel.add(problemComboBox, BorderLayout.NORTH); // Add ComboBox above the RUN button

        // Create the "Output" panel
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new BorderLayout());

        JLabel outputLabel = new JLabel("OUTPUT");
        outputTextArea = new JTextArea(3, 10);
        outputTextArea.setEditable(false);

        outputPanel.add(outputLabel, BorderLayout.NORTH);
        outputPanel.add(outputTextArea, BorderLayout.CENTER);

        // Add panels to the main frame in the desired order
        add(inputPanel, BorderLayout.WEST);
        add(buttonPanel, BorderLayout.CENTER);
        add(outputPanel, BorderLayout.EAST);

        // Display the frame
        setVisible(true);
    }
    
    // Helper function to check if a number is prime
    public boolean isPrime(long n) {
        if(n < 2) return false;
        for(int i = 2; i * i <= (int)Math.sqrt(n); i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public String Normalization(String s){
        String[] arr = s.trim().split("\\s+");

        String res = "";
        for (String x : arr) {
            res += Character.toUpperCase(x.charAt(0));
            for (int j = 1; j < x.length(); j++) {
                res += Character.toLowerCase(x.charAt(j));
            }
            res += " ";
        }
        res = res.trim();
        return res;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == runButton) {
            try {
                String selectedProblem = (String) problemComboBox.getSelectedItem();
                if (selectedProblem.equals("J01001 - HÌNH CHỮ NHẬT")) {
                    try {
                        // Lấy dữ liệu từ inputTextArea và chuyển đổi nó thành hai số nguyên
                        String inputText = inputTextArea.getText();
                        String[] dimensions = inputText.split("\\s+");
                        if (dimensions.length != 2) {
                            outputTextArea.setText("Please re-check input");
                            return;
                        }

                        int length = Integer.parseInt(dimensions[0]);
                        int width = Integer.parseInt(dimensions[1]);

                        if (length <= 0 || width <= 0) {
                            outputTextArea.setText("Please re-check input");
                        } else {
                            int perimeter = 2 * (length + width);
                            int area = length * width;
                            outputTextArea.setText(perimeter + " " + area);
                        }
                    } catch (NumberFormatException ex) {
                        outputTextArea.setText("Please re-check input");
                    }
                } else if (selectedProblem.equals("J01002 - TÍNH TỔNG N SỐ NGUYÊN DƯƠNG ĐẦU TIÊN")) {
                    try {
                        String s[] = inputTextArea.getText().split("\n");
                        int test = Integer.parseInt(s[0]);
                        while(test-- > 0) {
                            StringBuilder result = new StringBuilder();
                            for(int i = 1; i < s.length; i++){
                               long N = Integer.parseInt(s[i]);
                               long sum = (long) N * (N + 1) / 2;
                               result.append(sum).append("\n");
                            }
                            outputTextArea.setText(result.toString());
                        }
                    } catch (NumberFormatException ex) {
                        outputTextArea.setText("Please re-check input");
                    }
                } else if (selectedProblem.equals("J01004 - SỐ NGUYÊN TỐ")) {
                    try {
                        String s[] = inputTextArea.getText().split("\n");
                        int test = Integer.parseInt(s[0]);
                        while(test-- > 0) {
                            StringBuilder result = new StringBuilder();
                            for(int i = 1; i < s.length; i++){
                               long N = Integer.parseInt(s[i]);
                               if(isPrime(N)) {
                                   result.append("YES").append("\n");
                               }
                               else {
                                   result.append("NO").append("\n");
                               }
                            }
                            outputTextArea.setText(result.toString());
                        }
                    } catch (NumberFormatException ex) {
                        outputTextArea.setText("Please re-check input");
                    }
                } else if (selectedProblem.equals("J03004 - CHUẨN HÓA XÂU HỌ TÊN - 1")) {
                    try {
                        String s[] = inputTextArea.getText().split("\n");
                        int test = Integer.parseInt(s[0]);
                        while(test-- > 0) {
                            StringBuilder result = new StringBuilder();
                            for(int i = 1; i < s.length; i++){
                               String name = Normalization(s[i]);
                               result.append(name).append("\n");
                            }
                            outputTextArea.setText(result.toString());
                        }
                    } catch (NumberFormatException ex) {
                        outputTextArea.setText("Please re-check input");
                    }
                }
            } catch (NumberFormatException ex) {
                outputTextArea.setText("Please re-check input");
            }
        }
    }
}

