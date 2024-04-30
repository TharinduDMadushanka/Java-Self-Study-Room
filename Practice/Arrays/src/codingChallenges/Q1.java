package codingChallenges;

import java.util.Arrays;
import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        Random random=new Random();
        int r =random.nextInt(101);

        int[] a =new int[10];
        int[] b =new int[10];

        if (r<50){
            for (int i=0;i<a.length;i++){
                a[i]=r;
            }
        }else {
            for (int i=0;i<b.length;i++){
                b[i]=r;
            }
        }
        System.out.println("a-->"+ Arrays.toString(a));
        System.out.println("b-->"+ Arrays.toString(b));
    }
}
