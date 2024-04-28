package ArraysBasics;

// Array Search
//Write a Java program to search for a specific element in an integer array and return its index. If the element is not found, return -1.

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int[] a={1,2,3,4,5,6,7};

        System.out.print("Enter an number for search:");
        int nb =input.nextInt();

        for (int i=0;i<a.length;i++){
            if (nb==a[i]){
                System.out.println("Nb found in index of "+ i);
                return;
            }
        }
        System.out.println("-1");
    }
}
