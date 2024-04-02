import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        // Create an array of integers with size 6
        int[] marks = new int[6];

        // Prompt the user to enter 6 marks and store them in the array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 6 marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }

        // Display the values in the array using enhanced for loop
        System.out.println("Marks entered:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        // Calculate the number of students who have failed (mark lower than 40) and the average mark
        int numFailed = 0;
        int sum = 0;
        for (int mark : marks) {
            if (mark < 40) {
                numFailed++;
            }
            sum += mark;
        }

        // Calculate the average mark
        double average = (double) sum / marks.length;

        // Print the number of students who have failed and the average mark
        System.out.println("Number of students who have failed: " + numFailed);
        System.out.println("Average mark: " + average);
    }
}
