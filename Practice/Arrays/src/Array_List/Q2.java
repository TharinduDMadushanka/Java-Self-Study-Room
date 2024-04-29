package Array_List;

// add elements to an array list input by user

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        ArrayList<Integer> arr =new ArrayList<>();

        System.out.println("Enter -1 to exit.\nEnter numbers for add to list:");

        while (true){
            int nb=input.nextInt();

            if (nb==-1){
                break;
            }

            arr.add(nb);
        }
        System.out.println("Elements added.");
        System.out.println(arr);;
    }
}
