package ArraysBasics;

public class A {
    public static void main(String[] args) {
        int[] a = {12, 34, 56, 78, 90, 10};

        for (int i=0;i<a.length;i++){
            System.out.println(i+" "); //---> prints indexes in this array
            System.out.println(a[i]+" "); //---> prints values in the array
        }
    }
}
