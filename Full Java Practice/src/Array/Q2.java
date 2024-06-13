package Array;

/**
 * Write a Java program to sum values of an array.
 */
public class Q2 {
    public static void main(String[] args) {

        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int count=0;

        for(int i=0;i<arr.length;i++){
            count+=arr[i];
        }
        System.out.println(count);
    }
}
