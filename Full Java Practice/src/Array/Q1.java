package Array;

/**
 *  Write a Java program to sort a numeric array and a string array.
 */
public class Q1 {
    public static void main(String[] args) {

        int[] arr1 = {11, 23, 34, 23, 5};

        for (int i = 0; i < arr1.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] < arr1[min]) {
                    min = j;
                }
            }
            int temp = arr1[min];
            arr1[min] = arr1[i];
            arr1[i] = temp;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+", ");
        }
        System.out.println();
    }
}
