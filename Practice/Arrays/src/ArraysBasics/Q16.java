package ArraysBasics;

/**
 * Array Removal
 * Write a Java program to remove a specific element from an integer array. After removal, shift all subsequent elements to the left to fill the gap.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 5, 6, 7};

        System.out.print("Enter a nb for remove :");
        int nb = input.nextInt();

        a = removeArray(a, nb);
        System.out.println(Arrays.toString(a));

    }

    public static int[] removeArray(int[] a, int nb) {
        if (a == null || nb < 0 || nb >= a.length) {
            return a;
        }
        int[] temp = new int[a.length - 1];

        for (int i = 0, k = 0; i < a.length; i++) {
            if (a[i] == nb) {
                continue;
            }
            temp[k++] = a[i];
        }
        return temp;
    }

}
