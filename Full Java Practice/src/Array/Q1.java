package Array;

import java.util.Arrays;

/**
 *  Write a Java program to sort a numeric array and a string array.
 */
public class Q1 {
    public static void main(String[] args) {

        int[] arr1 = {11, 23, 34, 23, 5};
        int[] arr2 ={23,43,45,65,4,56,7};

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

        System.out.println("--------------------------------");
        Arrays.sort(arr2);
        System.out.print(Arrays.toString(arr2));
    }
}
