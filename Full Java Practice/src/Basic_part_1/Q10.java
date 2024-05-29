package Basic_part_1;

import java.util.Scanner;

/**
 * Write a Java program to compare two numbers
 */
public class Q10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter 1st nb :");
        int nb1= input.nextInt();;

        System.out.print("Enter 2nd nb :");
        int nb2 = input.nextInt();

        if (nb1==nb2){
            System.out.println(nb1+" = "+nb2);
        } else if (nb1<nb2) {
            System.out.println(nb1+" < "+nb2);
        } else if (nb1>nb2) {
            System.out.println(nb1+" > "+nb2);
        }else {
            System.out.println(nb1+" != "+nb2);
        }
    }
}
