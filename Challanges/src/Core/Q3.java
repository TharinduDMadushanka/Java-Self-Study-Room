package Core;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter a number:");
        int nb =input.nextInt();

        if (nb%2==0){
            if (nb<10){
                System.out.println("Even, bellow 10");
            } else if (nb>10 && nb<20) {
                System.out.println("Even, between 10 and 20");
            }else {
                System.out.println("Even, over 20");
            }
        }else {
            System.out.println("Odd");
        }

    }
}
