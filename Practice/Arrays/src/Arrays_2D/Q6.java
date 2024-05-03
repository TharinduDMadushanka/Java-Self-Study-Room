package Arrays_2D;

//min value of each column

public class Q6 {
    public static void main(String[] args) {
        int[][] integers = {{1, 10, 3, 8}, {9, 12, 6, 7}, {5, 2, 11, 4}};

        for (int j=0;j<integers[0].length;j++){
            int min=integers[0][j];
            for (int i=0;i<integers.length;i++) {
                if (integers[i][j]<min){
                    min=integers[i][j];
                }
            }
            System.out.println("The min value of column "+(j+1)+" : "+min);
        }
    }
}
