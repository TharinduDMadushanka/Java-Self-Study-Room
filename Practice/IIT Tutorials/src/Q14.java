import java.util.ArrayList;

public class Q14 {
    public static void main(String[] args) {
        // Define the set A
        int[] A = {2, 3, 4, 5, 6, 7, 8, 9};

        // Part a: Find even numbers in set A
        System.out.println("Even numbers in set A:");
        for (int num : A) {
            if (isEven(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Part b: Find numbers that, when multiplied by 2, give a number that is also in set A
        System.out.println("Numbers in set A that, when multiplied by 2, give a number also in set A:");
        for (int num : A) {
            if (isDoubledElementInSet(num, A)) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to check if a number, when multiplied by 2, gives a number that is also in set A
    public static boolean isDoubledElementInSet(int num, int[] set) {
        int doubledNum = num * 2;
        for (int element : set) {
            if (doubledNum == element) {
                return true;
            }
        }
        return false;
    }
}
