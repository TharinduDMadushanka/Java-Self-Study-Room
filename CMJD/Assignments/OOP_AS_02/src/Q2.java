import javax.swing.*;
import java.awt.*;

public class Q2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Window");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("Button1"), BorderLayout.NORTH);
        frame.add(new JButton("Button2"), BorderLayout.SOUTH);
        frame.add(new JButton("Button3"), BorderLayout.EAST);
        frame.add(new JButton("Button4"), BorderLayout.WEST);
        frame.add(new JButton("Button5"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
