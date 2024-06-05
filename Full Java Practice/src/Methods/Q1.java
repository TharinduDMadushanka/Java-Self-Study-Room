package Methods;

import java.util.Scanner;

/**
 *  Write a Java method to find the smallest number among three numbers.
 */
public class Q1 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter nb1: ");
        int nb1= input.nextInt();

        System.out.print("Enter nb2: ");
        int nb2= input.nextInt();

        System.out.print("Enter nb3: ");
        int nb3= input.nextInt();
    }
    public static void findSmall(int nb1,int nb2,int nb3){

        int small=nb1;

        if (nb2<small){
            small=nb2;
        } else if (nb3<small) {
            small=nb3;
        }else {
            System.out.println("Number are same value.");
        }

        System.out.println("Smallest nb is "+small);
    }
}
