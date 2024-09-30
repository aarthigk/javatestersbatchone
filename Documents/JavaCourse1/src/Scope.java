import javafx.scene.shape.Circle;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;


public class Scope {
    /*
    Local variables—in scope from declaration to end of block
    Instance variables—in scope from declaration until object garbage collected
    Class variables—in scope from declaration until program ends
    */
    public static void main(String[] args) {
        try {
            // Load the image (PNG or JPG)
            File inputFile = new File("C:\\Users\\gkaar\\Downloads\\Orange.png"); // Change to your image file path
            BufferedImage image = ImageIO.read(inputFile);

            // Create a graphics context from the image
            Graphics2D g2d = image.createGraphics();

            // Set the font for binary text (adjust size if necessary)
        //    g2d.setFont(new Font("Monospaced", Font.PLAIN, 20));
          //  g2d.setFont(new Font("Monospaced", Font.BOLD, 30));
            g2d.setFont(new Font("Serif", Font.BOLD, 30));// Monospaced font in bold
          //  g2d.setColor(new Color(0, 255, 0, 120));
            //g2d.setColor(new Color( 48, 25, 52, 120));// Semi-transparent green for binary text
            //g2d.setColor(new Color( 139, 0, 139, 120));

            g2d.setColor(new Color(14, 0, 139, 120));


            // Loop over the image to draw binary text
            int width = image.getWidth();
            int height = image.getHeight();
            int textSpacing =15; // Adjust spacing between lines of binary text

            for (int y = 0; y < height; y += textSpacing) {
                for (int x = 0; x < width; x += textSpacing) {
                    // Generate random 0 or 1
                    String binary = Math.random() > 0.5 ? "1" : "0";
                    // Draw the binary number
                    g2d.drawString(binary, x, y);
                }
            }

            int widthH = image.getWidth();
            int heightH = image.getHeight();
            int textSpacingg =45; // Adjust spacing between lines of binary text

            g2d.setColor(new Color(25, 139, 0, 120));
                for (int x = 0; x < widthH; x += textSpacingg) {
                    for (int y = 0; y < heightH; y += textSpacingg) {
                    // Generate random 0 or 1
                    String binary = Math.random() > 0.5 ? "1" : "0";
                    // Draw the binary number
                    g2d.drawString(binary, x, y);
                }
            }

             width = image.getWidth();
             height = image.getHeight();
             textSpacing =55; // Adjust spacing between lines of binary text

            g2d.setColor(new Color(243, 115, 36, 160));
            for (int x = 0; x < widthH; x += textSpacingg) {
                for (int y = 0; y < heightH; y += textSpacingg) {
                    // Generate random 0 or 1
                    String binary = Math.random() > 0.5 ? "1" : "0";
                    // Draw the binary number
                    g2d.drawString(binary, x, y);
                }
            }

            width = image.getWidth();
            height = image.getHeight();
            textSpacing =15; // Adjust spacing between lines of binary text

            g2d.setColor(new Color(139, 21, 0, 120));
            for (int y = 0; y < heightH; y += textSpacingg) {
            for (int x = 0; x < widthH; x += textSpacingg) {
                                    // Generate random 0 or 1
                    String binary = Math.random() > 0.5 ? "!!" : "&&";
                    // Draw the binary number
                    g2d.drawString(binary, x, y);

                }
            }

            width = image.getWidth();
            height = image.getHeight();
            textSpacing =68; // Adjust spacing between lines of binary text

            g2d.setColor(new Color(139, 0, 58, 105));
            for (int y = 0; y < heightH; y += textSpacingg) {
                for (int x = 0; x < widthH; x += textSpacingg) {
                    // Generate random 0 or 1
                    String binary = Math.random() > 0.5 ? "1" : "0";
                    // Draw the binary number
                    g2d.drawString(binary, x, y);


                }
            }
            g2d.setFont(new Font("SansSerif" ,Font.BOLD, 99));
            g2d.setColor(Color.black);

         //   g2d.drawString("Test Archive", 500,700);


            // Dispose of the graphics context and save the new image
            g2d.dispose();
            File outputFile = new File("output_image_with_binary_overlay.png"); // Output file path
            ImageIO.write(image, "png", outputFile);

            System.out.println("Overlay applied and image saved!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
