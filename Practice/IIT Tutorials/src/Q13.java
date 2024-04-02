import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        // Create an array of length 10 filled with double values
        double[] array = new double[10];

        // Fill the array with sample values (you can replace these with your own)
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 1.5; // Just an example, you can input values from the user as well
        }

        // Print the original array
        System.out.println("Original array:");
        printArray(array);

        // Input indices i and j from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index i: ");
        int i = scanner.nextInt();
        System.out.print("Enter index j: ");
        int j = scanner.nextInt();

        // Check if i and j are within the valid range
        if (i >= 0 && i < array.length && j >= 0 && j < array.length) {
            // Swap the values at indices i and j
            double temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            // Print the array after swapping
            System.out.println("Array after swapping:");
            printArray(array);
        } else {
            System.out.println("Invalid indices. Please enter indices within the range of 0 to 9.");
        }
    }

    // Method to print array elements
    public static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
