package Core;

// Reverse a User input string

import java.util.Scanner;

// Approach 1
public class Q5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter a word:");
        String str =input.next();

        char[] ar =str.toCharArray();
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(ar[i]);
        }
    }
}