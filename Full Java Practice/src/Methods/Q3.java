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

        checkMiddle(word);

    }
    public static void checkMiddle(String word){

        char[] chars = word.toCharArray();

        if (chars.length%2==0){
            for (int i = 0; i < chars.length/2; i+=2){
                i=chars.length/2-1;
                System.out.print("Middle characters are :");
                System.out.print(chars[i]);
                System.out.print(", "+chars[i+1]);
            }
        }else {
            for (int i = 0; i < chars.length/2; i++) {
                i=chars.length/2;
                System.out.print("Middle character is: ");
                System.out.print(chars[i]);
            }
        }
    }
}
