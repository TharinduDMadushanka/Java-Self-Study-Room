import javax.swing.*;
import java.awt.*;

public class Q3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Window");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel northLabel = new JLabel("North Label", JLabel.CENTER);
        JLabel southLabel = new JLabel("South Label", JLabel.CENTER);

        frame.add(northLabel, BorderLayout.NORTH);
        frame.add(southLabel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
