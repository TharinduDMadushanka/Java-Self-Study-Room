/**
 * Q23
 */
import java.awt.*;
import javax.swing.*;

class MyFrame1 extends JFrame {
    private JCheckBox plainCheckBox, boldCheckBox, italicCheckBox;

    MyFrame1() {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("JCheckBox Example");
        setLayout(new FlowLayout());

        // Initialize checkboxes
        plainCheckBox = new JCheckBox("Plain", true);  // Default selected
        boldCheckBox = new JCheckBox("Bold");
        italicCheckBox = new JCheckBox("Italic");

        // Add checkboxes to the frame
        add(plainCheckBox);
        add(boldCheckBox);
        add(italicCheckBox);
    }
}

class Q19 {
    public static void main(String args[]) {
        new MyFrame().setVisible(true);
    }
}
