package Arrays_2D;

/**
 * Maximum Element
 * Write a Java program to find the maximum element in a 2D integer array and print its position (row and column).
 */

public class Q8 {
    public static void main(String[] args) {

        int[][] integers = {{1, 10, 3, 8}, {9, 12, 6, 7}, {5, 2, 11, 4}};

        int all=0;

        for (int i = 0; i < integers.length; i++) {
            int max = integers[i][0];
            for (int j = 0; j < integers[i].length; j++) {
                if (max < integers[i][j]) {
                    max = integers[i][j];
                }
            }
            System.out.println("The maximum number of row "+(i+1)+" :\t" + max);

            if (all<max){
                all=max;
            }
        }
        System.out.println("Max element :"+all);
    }
}
