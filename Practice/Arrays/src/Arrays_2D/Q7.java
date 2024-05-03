package Arrays_2D;

/**
 * Sum of Elements
 * Write a Java program to calculate the sum of all elements in a 2D integer array.
 */

public class Q7 {
    public static void main(String[] args) {

        int[][] integers = {{1, 10, 3, 8}, {9, 12, 6, 7}, {5, 2, 11, 4}};

        int sum=0;

        for (int i=0;i<integers.length;i++){
            for (int j=0;j<integers[i].length;j++){
                sum+=integers[i][j];
            }
        }
        System.out.println("Sum :"+sum);
    }
}
