package Basic_part_1;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a circle.
 */
public class Q8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter value of 'r':");
        double r= input.nextInt();;

        double area=Math.PI*r*r;

        System.out.println(area);
    }
}
