package codingChallenges;

import java.util.Arrays;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random random = new Random();


        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++) {
            int r = random.nextInt(101);

            if (r < 50) {
                a[i] = r;
            }else {
                b[i]=r;
            }
        }


        System.out.println("a-->" + Arrays.toString(a));
        System.out.println("b-->" + Arrays.toString(b));
    }
}