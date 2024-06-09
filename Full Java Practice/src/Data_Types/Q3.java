package Data_Types;

import java.util.Scanner;

/**
 * Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter an integer between 0 - 1000: ");
        int nb =input.nextInt();

        int sum=0;

        if (nb>0 && nb<1000) {
            while (nb!=0) {
                sum=sum+(nb%10);
            }
        }
        System.out.println(sum);
    }
}
