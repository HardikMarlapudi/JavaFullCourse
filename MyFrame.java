
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyFrame() {

        this.setTitle("JFrame title goes here"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true); // prevent to be resized
        this.setSize(420,420); //sets the x-dimesion, and y-dimesion of frame
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("logo.png"); //create an image icon
        this.setIconImage(image.getImage()); //change icon of the frame
        this.getContentPane().setBackground(new Color(0x123456)); // change of color background

    }
      
}
