package Basic_part_1;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers for array");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter nb " + (i + 1) + ":");
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        if (arr[0]==arr[arr.length-1]){
            System.out.println("true");
        }

    }
}

