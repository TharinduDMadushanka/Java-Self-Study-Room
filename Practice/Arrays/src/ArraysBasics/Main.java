package ArraysBasics;

// Insert elements in to front of the array

public class Main {
    public static void main(String[] args) {

        int[] a =new int[5];

        a[0]=10;
        a[1]=12;
        a[2]=14;
        a[3]=15;
        a[4]=17;

        //a[5]=20; ---> ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}