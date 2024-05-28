import java.awt.*;
import javax.swing.*;

class MyFrame2 extends JFrame {
    private JComboBox<String> monthComboBox, yearComboBox;
    private JComboBox<Integer> dayComboBox;

    MyFrame2() {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Date Picker Example");
        setLayout(new FlowLayout());

        // Initialize day, month, and year combo boxes
        Integer[] days = new Integer[31];
        for (int i = 0; i < 31; i++) {
            days[i] = i + 1;
        }
        dayComboBox = new JComboBox<>(days);
        dayComboBox.setSelectedItem(6);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        monthComboBox = new JComboBox<>(months);
        monthComboBox.setSelectedIndex(3);  // April
        monthComboBox.setMaximumRowCount(4);

        String[] years = {"2010", "2011", "2012", "2013", "2014", "2015"};
        yearComboBox = new JComboBox<>(years);
        yearComboBox.setSelectedItem("2013");

        // Add combo boxes to the frame
        add(dayComboBox);
        add(monthComboBox);
        add(yearComboBox);
    }
}

class Q24 {
    public static void main(String args[]) {
        new MyFrame().setVisible(true);
    }
}
