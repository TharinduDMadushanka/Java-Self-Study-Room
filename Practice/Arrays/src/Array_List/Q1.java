package Array_List;

// Basics of Array Lists

import java.util.ArrayList; // -->Import Statement

public class Q1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); // ---> Declaration and Initialization

        numbers.add(10);
        numbers.add(20); // --> adding elements
        numbers.add(30);

        System.out.println(numbers); //--> print the array [10, 20, 30]

        System.out.println(numbers.get(0)); // --> accessing the elements, prints 10

        System.out.println(numbers.size()); // --> Returns the number of elements (3 in this case)

        /**
         * we can use for loop or for-each loop to iterate array lists
         */
        for (int num : numbers) {
            System.out.print(num+" "); // prints 10 20 30
        }

        System.out.println(numbers.remove(0)); // Removes the element at index 0

//        boolean x = numbers.remove(Integer.valueOf(20));
        System.out.println(numbers.remove(Integer.valueOf(20))); // Removes the element with value 20

        System.out.println(numbers.contains(30)); // // Checks if the list contains value 30, give true or false

        numbers.clear(); // Removes all elements from the list

        System.out.println(numbers);
    }
}
