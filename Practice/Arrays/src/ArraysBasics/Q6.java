package ArraysBasics;

// Te average of the values in an array

public class Q6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        double avg=0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        avg=(double) sum/a.length;

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: "+avg);
    }
}

