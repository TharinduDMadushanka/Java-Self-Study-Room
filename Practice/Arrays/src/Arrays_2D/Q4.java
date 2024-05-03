package Arrays_2D;

// min value of each row

public class Q4 {
    public static void main(String[] args) {

        int[][] integers={{1,10,3,8},{9,12,6,7},{5,2,11,4}};

        for(int i=0;i<integers.length;i++){
            int min=integers[i][0];
            for (int j=0;j<integers[i].length;j++) {
                if (integers[i][j]<min){
                    min =integers[i][j];
                }
            }
            System.out.println("The min value of row "+(i+1)+" : "+min);
        }
    }
}
