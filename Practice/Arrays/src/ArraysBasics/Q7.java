package ArraysBasics;

// The max value in an array

public class Q7 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int max=a[0];

        for (int i=0;i<a.length;i++){
            if (max<a[i]){
                max=a[i];
            }
        }
        System.out.println("The max value is: "+max);
    }
}
