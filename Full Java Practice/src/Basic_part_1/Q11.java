package Basic_part_1;

import java.util.Scanner;

/**
 * Write a Java program and compute the sum of an integer's digits.
 */
public class Q11 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter a nb:");
        int nb = input.nextInt();

        int count =0;

        while (nb!=0){
            count+=nb%10;
            nb/=10;
        }
        System.out.println(count);
    }
}
