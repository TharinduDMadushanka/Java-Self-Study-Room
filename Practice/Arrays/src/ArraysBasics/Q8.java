package ArraysBasics;

public class Q8 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6,-1};
        int min=a[0];

        for (int i=0;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println("The min value is: "+min);
    }
}
