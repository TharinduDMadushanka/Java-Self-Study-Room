import java.util.Arrays;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] a = new int[10];
        int[] b = new int[10];
        int bIndex = 0; // Index for tracking elements added to array b

        for (int i = 0; i < a.length; i++) {
            int r = random.nextInt(101);

            if (r == 0) {
                // Add 0 to array b
                b[bIndex++] = r;
            } else if (r < 50) {
                a[i] = r;
            } else {
                b[bIndex++] = r;
            }
        }

        // Trim array b to remove any trailing 0s
        b = Arrays.copyOf(b, bIndex);

        System.out.println("a --> " + Arrays.toString(a));
        System.out.println("b --> " + Arrays.toString(b));
    }
}
