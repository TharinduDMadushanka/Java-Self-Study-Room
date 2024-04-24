package ArraysBasics;

// Insert elements by using loop in to front of the array ---> option 2

public class Q2 {
    int count = 0;

    public static void main(String[] args) {

        Q2 o = new Q2();

        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            o.insert(a, i);
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
    }

    public void insert(int[] a, int val) {
        a[count++] = val;
    }
}
