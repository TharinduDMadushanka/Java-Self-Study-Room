/**
 * Q14
 */
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
    private JTextField num1textField;
    private JTextField num2textField;
    private JButton equalsButton;
    private JLabel answerLabel;
    private JLabel operatorLabel;

    Calculator() {
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Calculator");
        setLayout(new FlowLayout());

        num1textField = new JTextField(5);
        num2textField = new JTextField(5);
        operatorLabel = new JLabel("+");
        answerLabel = new JLabel(" ");
        equalsButton = new JButton(" = ");

        add(num1textField);
        add(operatorLabel);
        add(num2textField);
        add(equalsButton);
        add(answerLabel);
    }

    public static void main(String args[]) {
        new Calculator().setVisible(true);
    }
}

