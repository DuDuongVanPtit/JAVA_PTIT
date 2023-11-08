package GUI.Bai3;

import java.awt.*;
import javax.swing.*;

public class Clock extends JFrame {
  public Clock() {
    // Create an analog clock for the current time
    AnalogClock clock = new AnalogClock();

    // Add the clock and message panel to the frame
    add(clock);
    add(clock.messagePanel, BorderLayout.SOUTH);
  }
}
