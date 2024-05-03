package Arrays_2D;

// Get sum of each row
//Get sum of each column

public class Q1 {
    public static void main(String[] args) {

        int[][] integer = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        System.out.println(integer.length); // 3

        for (int i=0;i<3;i++){  // i<3 --> iterate till row count (integer.length)
            int sumRow=0;
            for (int j=0;j<4;j++){  //i<4 --> iterate till column count (integer[i].length)
                sumRow+=integer[i][j];
            }
            System.out.println("The sum of row " + (i + 1) + " : " + sumRow);
        }
    }
}
