package Arrays_2D;

/**
 * /**
 *  * Row with Minimum Sum
 *  * Write a Java program to find the row with the minimum sum of elements in a 2D integer array.
 */

public class Q10 {
    public static void main(String[] args) {

        int[][] integers = {{1, 10, 3, 8}, {9, 12, 6, 7}, {5, 2, 11, 6}};
        int min=Integer.MAX_VALUE; // Initialize min with a large value

        for (int i=0;i<integers.length;i++){
            int sum=0;
            for (int j=0;j<integers[i].length;j++){
                sum+=integers[i][j];
            }
            System.out.println("Tme sum of row "+(i+1)+" : "+sum);

            for (int z=0;z<integers.length;z++){
                if (sum<min){
                    min=sum;
                }
            }
        }
        System.out.println("Min sum of each row :"+min);
    }
}
