/**
 * Q18
 */
import javax.swing.*;
import java.awt.*;

class Q14 extends JFrame {
    JComboBox<String> colourBox;

    void MyFrame() {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("JComboBox");
        setLayout(new FlowLayout());

        colourBox = new JComboBox<>();
        colourBox.addItem("RED");
        colourBox.addItem("GREEN");
        colourBox.addItem("BLACK");
        colourBox.addItem("BLUE");
        add(colourBox);
    }

    public static void main(String args[]) {
        new MyFrame().setVisible(true);
    }
}
