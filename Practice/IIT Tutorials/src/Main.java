//Write a program in Java that asks the user to insert a name and a surname and prints the initials

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your fist name:");
        char first =input.next().charAt(0);

        System.out.println("Enter your second name:");
        char second =input.next().charAt(0);

        System.out.println("Your surname is:"+first+second);
    }
}