package Basic_part_1;

import java.util.Scanner;

/**
 * 38. Write a Java program to count letters, spaces, numbers and other characters in an input string.
 */
public class Q13 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter string:");

        char [] arr =input.nextLine().toCharArray();

        int letters =0;
        int nb=0;
        int whitespace=0;
        int others =0;

        for (int i=0;i< args.length;i++) {
            if (Character.isLetter(arr[i])){
                letters++;
            } else if (Character.isDigit(arr[i])) {
                nb++;
            }else if (Character.isWhitespace(arr[i])){

            }
        }
    }
}