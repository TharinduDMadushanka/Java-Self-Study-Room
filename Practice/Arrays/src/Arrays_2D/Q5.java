package Arrays_2D;

// max value of each column

public class Q5 {
    public static void main(String[] args) {

        int[][] integers = {{1, 10, 3, 8}, {9, 12, 6, 7}, {5, 2, 11, 4}};

        for (int j = 0; j < integers[0].length; j++) {
            int max = integers[0][j];
            for (int i = 1; i < integers.length; i++) {
                if (max < integers[i][j]) {
                    max = integers[i][j];
                }
            }
            System.out.println("The max value of column " + (j + 1) + " : " + max);
        }
    }
}
