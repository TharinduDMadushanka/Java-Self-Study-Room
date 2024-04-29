package Array_List;

// add elements to an array list input by user

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        ArrayList<Integer> arr =new ArrayList<>();

        System.out.println("Enter 'done' to exit.\nEnter elements to add list:");

        while (true){
            String nb =input.nextLine();

            // Check if the user wants to finish entering elements
            if (nb.equalsIgnoreCase("done")){
                break;
            }

            arr.add(Integer.parseInt(nb)); // Convert user input to integer
        }
        System.out.println("Elements added to the ArrayList:");
        System.out.println(arr);
    }
}
