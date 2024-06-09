package Methods;

import java.util.Scanner;

/**
 * Write a Java method to display the middle character of a string.
 */
public class Q3 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = input.nextLine();

        char[] chars = word.toCharArray();

//        for (int i = 0; i < chars.length; i++) {
//            System.out.print(chars[i]+", ");
//        }

        for (int i = 0; i < chars.length/2; i++) {
            i=chars.length/2;
            System.out.println(chars[i]);
        }

    }
}
