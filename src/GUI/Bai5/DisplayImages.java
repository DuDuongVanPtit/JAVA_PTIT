package GUI.Bai5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class DisplayImages extends JFrame {
    private ArrayList<Image> images;
    private JPanel imagePanel;
    private JScrollPane scrollPane;

    public DisplayImages() {
        setTitle("Exercise 5");
        setSize(800, 600);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Initialize data structures
        images = new ArrayList<>();

        // Create a panel for image display
        imagePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Create a scroll pane to hold the image panel
        scrollPane = new JScrollPane(imagePanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Create buttons for image selection and resizing
        JButton selectImageBtn = new JButton("Chọn Ảnh");
        JButton resizeImageBtn = new JButton("Thay đổi kích thước ảnh");

        // Add action listeners for buttons
        selectImageBtn.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    Image image = ImageIO.read(selectedFile);
                    images.add(image);
                    displayImages();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        resizeImageBtn.addActionListener(e -> {
            // Get user input for the new width and height
            String widthInput = JOptionPane.showInputDialog("Nhập chiều rộng mới:");
            String heightInput = JOptionPane.showInputDialog("Nhập chiều cao mới:");

            // Check if the user canceled or left any of the fields blank
            if (widthInput == null || heightInput == null || widthInput.isEmpty() || heightInput.isEmpty()) {
                return; // Exit if the user canceled or left fields blank
            }

            int newWidth = Integer.parseInt(widthInput);
            int newHeight = Integer.parseInt(heightInput);

            // Check if there are images to resize
            if (images.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Chưa có hình ảnh để thay đổi kích thước, hãy chọn hiển thị một số hình ảnh lên màn hình trước", "Không có hình ảnh", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            // Iterate through the images and resize each one
            ArrayList<Image> resizedImages = new ArrayList<>();
            for (Image originalImage : images) {
                if (originalImage instanceof BufferedImage) {
                    BufferedImage bufferedImage = (BufferedImage) originalImage; // Cast to BufferedImage
                    int type = bufferedImage.getType();
                    BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, type);
                    Graphics2D g2 = resizedImage.createGraphics();
                    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                    g2.drawImage(bufferedImage, 0, 0, newWidth, newHeight, null);
                    g2.dispose();
                    resizedImages.add(resizedImage);
                } else {
                    // Handle non-BufferedImage case
                    // You can choose to convert the image as needed

                    // Convert the non-BufferedImage image to a BufferedImage
                    int type = BufferedImage.TYPE_INT_ARGB;
                    BufferedImage bufferedImage = new BufferedImage(originalImage.getWidth(null), originalImage.getHeight(null), type);
                    Graphics2D g2 = bufferedImage.createGraphics();
                    g2.drawImage(originalImage, 0, 0, null);
                    g2.dispose();

                    // Resize the converted BufferedImage as usual
                    BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, type);
                    Graphics2D g2Resized = resizedImage.createGraphics();
                    g2Resized.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                    g2Resized.drawImage(bufferedImage, 0, 0, newWidth, newHeight, null);
                    g2Resized.dispose();
                    resizedImages.add(resizedImage);
                }
            }

            // Update the images list with resized images
            images = resizedImages;

            // Display the resized images
            displayImages();
        });




        // Add components to the frame
        add(scrollPane, BorderLayout.CENTER);
        add(selectImageBtn, BorderLayout.NORTH);
        add(resizeImageBtn, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void displayImages() {
        imagePanel.removeAll();

        for (Image image : images) {
            ImageIcon icon = new ImageIcon(image);
            JLabel imageLabel = new JLabel(icon);

            // Set alignment to the upper-left corner
            imageLabel.setHorizontalAlignment(SwingConstants.LEFT);
            imageLabel.setVerticalAlignment(SwingConstants.TOP);

            imagePanel.add(imageLabel);
        }

        imagePanel.revalidate();
        imagePanel.repaint();
    }
}
