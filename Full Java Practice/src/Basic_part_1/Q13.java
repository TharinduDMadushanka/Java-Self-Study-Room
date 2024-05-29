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

        for (int i= arr.length-1;i>=0;i--){
            letters++;
        }
        System.out.println(letters);
    }
}
