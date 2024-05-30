package Basic_part_1;

public class Q20 {
    public static void main(String[] args) {
        int[] arr =new int[5];

        System.out.println("Enter 5 numbers for array:");

        for (int i=0;i<5;i++){
            System.out.print("\nEnter nb "+(i+1));
            arr[i]=i;
        }
    }
}
