package Basic_part_1;

import java.util.Scanner;

/**
 * Write a Java program that takes two numbers as input and displays the product of two numbers.
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter nb1:");
        int nb1=input.nextInt();
        System.out.println("Enter nb2:");
        int nb2=input.nextInt();

        int result =nb1*nb2;
        System.out.println(nb1+" * "+nb2+" = "+result);
    }
}
