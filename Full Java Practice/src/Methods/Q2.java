package Methods;

import java.util.Scanner;

/**
 * Write a Java method to compute the average of three numbers.
 */
public class Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first nb:");
        int nb1 = input.nextInt();

        System.out.println("Enter your second nb:");
        int nb2 = input.nextInt();

        System.out.println("Enter your third nb:");
        int nb3 = input.nextInt();

    }
    public void calcAverage(int nb1, int nb2, int nb3){

        int sum=nb1+nb2+nb3;
        int avg=sum/3;

        System.out.println("The average is "+avg);
    }
}
