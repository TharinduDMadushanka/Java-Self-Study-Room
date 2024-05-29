package Basic_part_1;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its multiplication table up to 10.
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter a number:");
        int nb = input.nextInt();

        for (int i=1;i<=10;i++) {
            int result =nb *i;
            System.out.println(nb+" x "+i+" = "+result);
        }
    }
}
