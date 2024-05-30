package Basic_part_1;

import java.util.Scanner;

/**
 *  Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
 */
public class Q19 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter nb 1:");
        int nb1= input.nextInt();

        System.out.print("Enter nb 2:");
        int nb2= input.nextInt();

        int sum =nb1+nb2;

        System.out.print("Enter nb 3:");
        int nb3 = input.nextInt();

        if (sum==nb3){
            System.out.println("The result is: true");
        }else {
            System.out.println("The result is: false");
        }
    }
}
