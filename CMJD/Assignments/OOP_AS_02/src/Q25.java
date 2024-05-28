//import java.awt.*;
//import javax.swing.*;
//
//class Equalizer extends JFrame {
//    private JSlider bassSlider, midSlider, trebleSlider;
//
//    Equalizer() {
//        setSize(400, 300);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setTitle("Equalizer");
//        setLayout(new GridLayout(3, 2));
//
//        // Initialize sliders
//        bassSlider = new JSlider(0, 100, 50);
//        bassSlider.setMajorTickSpacing(10);
//        bassSlider.setPaintTicks(true);
//        bassSlider.setPaintLabels(true);
//
//        midSlider = new JSlider(0, 100, 50);
//        midSlider.setMajorTickSpacing(10);
//        midSlider.setPaintTicks(true);
//        midSlider.setPaintLabels(true);
//
//        trebleSlider = new JSlider(0, 100, 50);
//        trebleSlider.setMajorTickSpacing(10);
//        trebleSlider.setPaintTicks(true);
//        trebleSlider.setPaintLabels(true);
//
//        // Add sliders and labels to the frame
//        add(new JLabel("Bass"));
//        add(bassSlider);
//        add(new JLabel("Mid"));
//        add(midSlider);
//        add(new JLabel("Treble"));
//        add(trebleSlider);
//    }
//}
//
//class Demo {
//    public static void main(String args[]) {
//        new Equalizer().setVisible(true);
//    }
//}
