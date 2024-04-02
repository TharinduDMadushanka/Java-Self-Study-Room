import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        // Define a multidimensional array to store the marks of 5 students in 3 subjects
        double[][] marks = new double[5][3];

        // Input marks for each student and each subject
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextDouble();
            }
        }

        // Calculate and print the average marks for each student
        System.out.println("\nAverage marks for each student:");
        for (int i = 0; i < 5; i++) {
            double sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += marks[i][j];
            }
            double average = sum / 3;
            System.out.println("Student " + (i + 1) + ": " + average);
        }
    }
}
