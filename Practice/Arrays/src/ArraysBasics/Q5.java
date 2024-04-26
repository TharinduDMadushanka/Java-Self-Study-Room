package ArraysBasics;

// Find the sum of values in an array

public class Q5 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int sum=0;

        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("The sum is: "+sum);
    }
}
