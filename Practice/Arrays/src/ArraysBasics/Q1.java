package ArraysBasics;

// Insert elements by using loop in to front of the array

public class Q1 {
    public static void main(String[] args) {

        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
    }
}
