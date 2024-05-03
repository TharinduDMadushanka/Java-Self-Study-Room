package Arrays_2D;

/**
 * Row with Maximum Sum
 * Write a Java program to find the row with the maximum sum of elements in a 2D integer array.
 */

public class Q9 {
    public static void main(String[] args) {

        int[][] integers = {{1, 10, 3, 8}, {9, 12, 6, 7}, {5, 2, 11, 4}};

        int maxSum = 0;

        for (int i = 0; i < integers.length; i++) {
            int sum = 0;
            for (int j = 0; j < integers[i].length; j++) {
                sum += integers[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " :" + sum);

            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("The maximum sum is :"+maxSum);
    }
}


