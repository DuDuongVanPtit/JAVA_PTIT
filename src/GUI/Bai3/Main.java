package GUI.Bai3;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
    Clock frame = new Clock();
    frame.setTitle("DisplayClock");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 500);
    frame.setVisible(true);
  }
}
