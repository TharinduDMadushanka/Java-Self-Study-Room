package Conditional_Statement;

import java.util.Scanner;

/**
 * Write a Java method to compute the average of three numbers.
 */
public class Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
        int a = input.nextInt();

        System.out.print("Input b: ");
        int b = input.nextInt();

        System.out.print("Input c: ");
        int c = input.nextInt();

        int result = b*b -4*a*c;

        if (result > 0) {
            double r1 =(-b +Math.sqrt(result))/(2*a);
            double r2 =(-b -Math.sqrt(result))/(2*a);
            System.out.println("The root are "+r1+" and "+r2);
        } else if (result==0) {
            double r1 = (double) -b /(2*a);
            System.out.println("The root are "+r1);
        }else {
            System.out.println("The equation has no root.");
        }

    }
}
