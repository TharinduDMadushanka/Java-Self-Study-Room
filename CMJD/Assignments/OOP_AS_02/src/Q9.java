/**
 * Q12
 */
import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
    MyFrame() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JPanel is a Container");

        JPanel buttonPanel = new JPanel();
        // Default layout of the JPanel is "FlowLayout"
        buttonPanel.add(new JButton("This is a large button"));
        buttonPanel.add(new JButton("Ok"));
        buttonPanel.add(new JButton("My Button"));

        add("Center", buttonPanel);
    }
}

class Q9 {
    public static void main(String args[]) {
        new MyFrame().setVisible(true);
    }
}
