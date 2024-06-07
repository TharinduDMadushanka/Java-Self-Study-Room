package Conditional_Statement;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers from the user and prints the greatest number
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter nb 1:");
        int nb1 = input.nextInt();

        System.out.print("Enter nb 2:");
        int nb2 = input.nextInt();

        System.out.print("Enter nb 3:");
        int nb3 = input.nextInt();
    }
    public static void findMax(int nb1, int nb2, int nb3){
        int max;
        if(nb1 > nb2 && nb1 > nb3){
            max = nb1;
        }else if(nb2 > nb1 && nb2 > nb3){
            max = nb2;
        }else if(nb3 > nb1 && nb3 > nb2){
            max = nb3;
        }
    }
}
