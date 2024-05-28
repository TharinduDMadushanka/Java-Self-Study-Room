//import java.awt.*;
//import javax.swing.*;
//
//class SpinnerExample extends JFrame {
//    private JSpinner numberSpinner, dateSpinner;
//
//    SpinnerExample() {
//        setSize(300, 100);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setTitle("JSpinner Example");
//        setLayout(new FlowLayout());
//
//        // Initialize the spinners
//        SpinnerModel numberModel = new SpinnerNumberModel(5, 0, 10, 1);
//        numberSpinner = new JSpinner(numberModel);
//
//        SpinnerModel dateModel = new SpinnerDateModel();
//        dateSpinner = new JSpinner(dateModel);
//
//        // Add the spinners to the frame
//        add(numberSpinner);
//        add(dateSpinner);
//    }
//}
//
//class Demo {
//    public static void main(String args[]) {
//        new SpinnerExample().setVisible(true);
//    }
//}
