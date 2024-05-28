
import java.awt.*;
import javax.swing.*;

class Q17 extends JFrame {
    private JComboBox<String> colourBox;

    void MyFrame() {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("JComboBox Example");
        setLayout(new FlowLayout());

        // Initialize the JComboBox with color options
        colourBox = new JComboBox<>(new String[] { "RED", "GREEN", "BLACK", "BLUE" });

        // Add the JComboBox to the frame
        add(colourBox);
    }
}

class Demo {
    public static void main(String args[]) {
        new MyFrame().setVisible(true);
    }
}
