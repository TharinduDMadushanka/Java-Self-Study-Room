package Methods;

import java.util.Scanner;

/**
 * Write a Java method to count all vowels in a string.
 */
public class Q4 {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();


    }
    public static void calcVowels(String word) {

        int count=0;
        char[] arr = word.toCharArray();
        char[] vowel={'a','e','i','o','u'};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (arr[i] == vowel[j]) {
                    count++;
                }
            }
        }
        System.out.println("Vowels: " + count)  ;
    }
}
