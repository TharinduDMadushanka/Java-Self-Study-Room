/**
 * Q21
 */
import java.awt.*;
import javax.swing.*;

class Q16 extends JFrame {
    private JToggleButton yesNoButton;

    void MyFrame() {
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Demonstrate JToggleButton");
        setLayout(new FlowLayout());

        // Add a label to explain the purpose of the button
        add(new JLabel("This is a toggle button"));

        // Initialize the toggle button with text "Yes/No" and set its initial state to true (pressed)
        yesNoButton = new JToggleButton("Yes/No", true);
        yesNoButton.setFont(new Font("", Font.BOLD, 20));

        // Add the toggle button to the frame
        add(yesNoButton);
    }
}

class Demo {
    public static void main(String args[]) {
        new MyFrame().setVisible(true);
    }
}
