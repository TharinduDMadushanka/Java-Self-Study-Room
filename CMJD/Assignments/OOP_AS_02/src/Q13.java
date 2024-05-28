/**
 * Q16
 */
import javax.swing.*;
import java.awt.*;

class Q13 extends JFrame {
    private JLabel titleLabel;

    void MyFrame() {
        setSize(250, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Demonstrate JLabel");
        titleLabel = new JLabel("This is a JLabel");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        Font f = new Font("Batang", Font.ITALIC, 20);
        titleLabel.setFont(f);
        ImageIcon image = new ImageIcon("facebook.png");
        titleLabel.setIcon(image);
        add("North", titleLabel);
    }

    public static void main(String args[]) {
        new MyFrame().setVisible(true);
    }
}
