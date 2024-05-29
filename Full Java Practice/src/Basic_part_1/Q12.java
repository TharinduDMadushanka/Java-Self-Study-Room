package Basic_part_1;

import java.util.Scanner;

/**
 * Write a Java program to reverse a string.
 */
public class Q12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter a string:");

        char[] letter =input.next().toCharArray();

        System.out.println("Reverse string: ");

        for (int i=letter.length-1;i>=0;i--){
            System.out.print(letter[i]);
        }
        System.out.println();
    }
}
