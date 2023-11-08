package GUI.Bai2;

import java.awt.*;
import javax.swing.*;

public class DrawFrame extends JFrame {
    private Color color;
    private int gIndex;
    private int numSides;
    private int categoryNumber;
    public DrawFrame(Color color,int gIndex,int numSides,int categoryNumber){
        this.color = color;
        this.gIndex = gIndex;
        this.numSides = numSides; 
        this.categoryNumber = categoryNumber;
        
        this.setTitle("Kết quả");
        this.setLayout(null);
        this.setSize(500,600);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        if(gIndex == 0){
            g2d.setColor(color);
            g2d.setStroke(new BasicStroke(5));
            if(categoryNumber == 0){
                g2d.fillOval(centerX-100, centerY-100, 200, 200);
            }
            else{
                g2d.drawOval(centerX-100, centerY-100, 200, 200);
            }
        }
        else if(gIndex == 1){
            g2d.setColor(color);
            g2d.setStroke(new BasicStroke(5));
            if(categoryNumber == 0){
                g2d.fillRect(centerX-150, centerY-100, 300, 200);
            }
            else{
                g2d.drawRect(centerX-150, centerY-100, 300, 200);
            }
        }
        else{
            int sideLength = 100; // Độ dài cạnh của đa giác

            int[] xPoints = new int[numSides];
            int[] yPoints = new int[numSides];

            for (int i = 0; i < numSides; i++) {
                double angle = 2 * Math.PI * i / numSides;
                xPoints[i] = (int) (centerX + sideLength * Math.cos(angle));
                yPoints[i] = (int) (centerY - sideLength * Math.sin(angle));
            }

            Polygon polygon = new Polygon(xPoints, yPoints, numSides);

            g2d.setColor(color);
            g2d.setStroke(new BasicStroke(5));
            if(categoryNumber == 0){
                g2d.fill(polygon);
            }
            else{
                g2d.draw(polygon);
            }
        }
        
    }
}
