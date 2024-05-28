import javax.swing.*;
import java.awt.*;

public class Q6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Left Alignment FlowLayout");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        frame.add(new JButton("Button1"));
        frame.add(new JButton("Button2"));
        frame.add(new JButton("Button3"));
        frame.add(new JButton("Button4"));

        frame.setVisible(true);
    }
}
