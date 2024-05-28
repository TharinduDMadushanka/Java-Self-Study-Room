/**
 * Q13
 */
import javax.swing.*;
import java.awt.*;

public class Q10 extends JFrame {
    public void CalculatorUI() {
        setTitle("Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel displayPanel = new JPanel();
        JTextField display = new JTextField(20);
        display.setHorizontalAlignment(JTextField.RIGHT);
        displayPanel.add(display);
        add(displayPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String text : buttons) {
            buttonPanel.add(new JButton(text));
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    public void main(String[] args) {
        setVisible(true);
    }
}
