package Arrays_2D;

/**
 * Column with Minimum Sum
 * Write a Java program to find the column with the minimum sum of elements in a 2D integer array.
 */

public class Q12 {
    public static void main(String[] args) {

        int[][] integers = {{1, 10, 3, 8}, {9, 12, 6, 7}, {5, 2, 11, 6}};

        int min=Integer.MAX_VALUE;
        int sum=0;

        for (int j=0;j<integers[0].length;j++){
            sum=integers[0][j];
            for (int i=1;i<integers.length;i++){
                sum+=integers[i][j];
            }
            System.out.println("The sum of column "+(j+1)+" :"+sum);

            if (sum<min){
                min=sum;
            }
        }
        System.out.println("The minimum sum is "+min);
    }
}
