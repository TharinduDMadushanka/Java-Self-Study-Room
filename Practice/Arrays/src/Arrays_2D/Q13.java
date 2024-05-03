package Arrays_2D;

/**
 * get user inputs and enter they in to the array
 */

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter row count: ");
        final int R = input.nextInt();

        System.out.print("Enter column count: ");
        final int C = input.nextInt();

        int[][] ar = new int[R][C];

        System.out.println("Enter elements for the array:");

        for (int i=0;i<R;i++){
            for (int j=0;j<C;j++){
                System.out.print("Enter data for row "+(i+1)+" , column "+(j+1)+" ->");
                ar[i][j]=input.nextInt();
            }
        }
        System.out.println("Prints data.");
        for (int i=0;i<R;i++){
            for (int j=0;j<C;j++){
                System.out.print(ar[i][j]+" ");
            }
        }
        System.out.println();
    }
}
