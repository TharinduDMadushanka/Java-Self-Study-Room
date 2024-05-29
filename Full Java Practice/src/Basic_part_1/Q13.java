package Basic_part_1;

import java.util.Scanner;

/**
 * 38. Write a Java program to count letters, spaces, numbers and other characters in an input string.
 */
public class Q13 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter string:");

        char [] letter =input.nextLine().toCharArray();

        int count =0;

        for (int i= letter.length-1;i>=0;i--){
            count++;
        }
        System.out.println(count);
    }
}
