/**
 * Q15
 */
import javax.swing.*;

class Q15 extends JFrame {
    private JLabel titleLabel;

    void MyFrame() {
        setSize(200, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Demonstrate JLabel");
        titleLabel = new JLabel("This is a JLabel");
        add("North", titleLabel);
    }

    public static void main(String args[]) {
        new MyFrame().setVisible(true);
    }
}

