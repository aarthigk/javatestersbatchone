import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageBinarySizeColorOverlay {

    public static void main(String[] args) {
        try {
            // Load the image (PNG or JPG)
            File inputFile = new File("C:\\Users\\gkaar\\Downloads\\Orange.png"); // Change to your image file path
            BufferedImage image = ImageIO.read(inputFile);

            // Create a new image with the same dimensions and transparent background
            BufferedImage binaryImage = new BufferedImage(
                    image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = binaryImage.createGraphics();

            // Loop through each pixel of the original image
            for (int y = 0; y < image.getHeight(); y += 15) { // Adjust y increment for spacing
                for (int x = 0; x < image.getWidth(); x += 15) { // Adjust x increment for spacing
                    // Get the color of the pixel
                    int pixel = image.getRGB(x, y);

                    // Extract RGB values from the pixel
                    int red = (pixel >> 16) & 0xff;
                    int green = (pixel >> 8) & 0xff;
                    int blue = pixel & 0xff;

                    // Calculate the brightness of the pixel (simple average method)
                    int brightness = (red + green + blue) / 3;

                    // Calculate the font size based on brightness (higher brightness = smaller text)
                    int fontSize = Math.max(10, 30 - brightness / 8); // Range from 10 to 30

                    // Set the font and color for the binary text
                    g2d.setFont(new Font("Monospaced", Font.BOLD, fontSize));
                    g2d.setColor(new Color(red, green, blue)); // Use the pixel's original color

                    // Generate a random 0 or 1
                    String binary = Math.random() > 0.5 ? "1" : "0";

                    // Draw the binary number at the pixel location
                    g2d.drawString(binary, x, y);
                }
            }

            // Dispose of the graphics context and save the new image
            g2d.dispose();
            File outputFile = new File("rabbit_binary_size_color_overlay.png"); // Output file path
            ImageIO.write(binaryImage, "png", outputFile);

            System.out.println("Binary size and color overlay applied and image saved!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
