package Recursive_Methods;

import java.util.Scanner;

/**
 * Write a Java recursive method to calculate the sum of all numbers from 1 to n.
 */
public class Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

    }
    public class calcSum{
        public static int calcSum(int n){
            if(n==0){
                return 0;
            }
            return n+calcSum(n-1);
        }
    }
}
