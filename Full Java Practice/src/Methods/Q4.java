package Methods;

import java.util.Scanner;

/**
 * Write a Java method to count all vowels in a string.
 */
public class Q4 {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        char[] arr = word.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
