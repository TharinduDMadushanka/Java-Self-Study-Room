import javax.swing.*;
import java.awt.*;

/**
 * Q1
 * Create a Window with following features:
 * a. Window size is 300x300
 * b. The command for the default close operation button is shutting down the JVM.
 * c. The title of the window is “My First Frame”.
 */
public class Q1 {
    public static void main(String[] args) {

        JFrame f1 = new JFrame();

        f1.setSize(300, 300);
        f1.setTitle("My First Frame");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);

        f1.setVisible(true);

    }
}