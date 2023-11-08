package GUI.Bai3;

import javax.swing.*;
import java.awt.*;

public class MessagePanel extends JPanel{
    public JLabel clockLabel;
    public MessagePanel (String s) {
        clockLabel = new JLabel(s, JLabel.CENTER);
        add(clockLabel);
        clockLabel.setForeground(Color.blue);
        clockLabel.setFont(new Font("Courie", Font.BOLD, 50));
    }
    public void updateMessage(AnalogClock clock) {
        
        clockLabel.setText(clock.getHour() +
      ":" + clock.getMinute() + ":" + clock.getSecond());
  }
}
