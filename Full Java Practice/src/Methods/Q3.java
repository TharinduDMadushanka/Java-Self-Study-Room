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

        if (chars.length%2==0){
            for (int i = 0; i < chars.length/2; i+=2){
                i=chars.length/2-1;
                System.out.println(chars[i]);
            }
        }

    }
}
