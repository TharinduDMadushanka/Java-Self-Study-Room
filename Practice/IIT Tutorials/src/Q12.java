public class Q12 {
    public static void main(String[] args) {
        String[] array = {"Alex", "Max", "Charlie", "Bob", "Ada", "Jim"};

        // Indices to swap
        int index1 = 2;
        int index2 = 4;

        // Print array before swapping
        System.out.println("Array before swapping:");
        printArray(array);

        // Swap values at index1 and index2
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            String temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        } else {
            System.out.println("Invalid indices.");
        }

        // Print array after swapping
        System.out.println("\nArray after swapping:");
        printArray(array);
    }

    // Method to print array elements
    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
