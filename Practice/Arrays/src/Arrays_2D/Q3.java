package Arrays_2D;

// get max number in each row

public class Q3 {
    public static void main(String[] args) {

        int[][] integers={{1,10,3,8},{9,12,6,7},{5,2,11,4}};

        for (int i=0;i<integers.length;i++){
            int max=integers[i][0];
            for (int j=0;j<integers[i].length;j++) {
                if (integers[i][j]>max){
                    max=integers[i][j];
                }
            }
            System.out.println("The max of row "+(i+1)+" : "+max);
        }
    }
}
