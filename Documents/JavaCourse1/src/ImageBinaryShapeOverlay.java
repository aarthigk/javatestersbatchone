import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageBinaryShapeOverlay {

    public static void main(String[] args) {
        try {
            // Load the image (PNG or JPG)
            File inputFile = new File("C:\\Users\\gkaar\\Downloads\\Orange.png"); // Change to your image file path
            BufferedImage image = ImageIO.read(inputFile);

            // Create a new image with the same dimensions and transparent background
            BufferedImage binaryImage = new BufferedImage(
                    image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = binaryImage.createGraphics();

            // Set the font and color for binary text
            g2d.setFont(new Font("Monospaced", Font.BOLD, 12)); // Adjust font size as needed
        //    g2d.setColor(Color.BLACK); // Set text color
            g2d.setColor(new Color( 139, 0, 139, 120));

            // Loop through each pixel of the original image
            for (int y = 0; y < image.getHeight(); y += 12) { // Spacing for binary text vertically
                for (int x = 0; x < image.getWidth(); x += 12) { // Spacing for binary text horizontally
                    // Get the color of the pixel
                    int pixel = image.getRGB(x, y);

                    // Check if the pixel is not part of the background (non-transparent or not white)
                    if ((pixel >> 24) != 0x00) { // Checks if the pixel is not fully transparent
                        // Draw a binary number (0 or 1) if pixel is part of the image
                        String binary = Math.random() > 0.5 ? "1" : "0";
                        g2d.drawString(binary, x, y);
                    }
                }
            }

            // Dispose of the graphics context and save the new image
            g2d.dispose();
            File outputFile = new File("rabbit_binary_shape.png"); // Output file path
            ImageIO.write(binaryImage, "png", outputFile);

            System.out.println("Binary shape overlay applied and image saved!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
