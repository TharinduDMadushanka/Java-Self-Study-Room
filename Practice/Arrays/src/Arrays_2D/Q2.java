package Arrays_2D;

//Get sum of each column

public class Q2 {
    public static void main(String[] args) {

        int[][] integer = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};


        int sum=0;

        for (int i=0;i<4;i++){  //i<4 --> iterate till column count (integer[i].length)
            sum=0;

            for (int j=0;j<3;j++){  // i<3 --> iterate till row count (integer.length)
                sum+=integer[j][i];
            }
            System.out.println("The sum of column " + (i + 1) + " : " + sum);
        }
    }
}
