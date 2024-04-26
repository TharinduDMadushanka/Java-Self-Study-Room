package ArraysBasics;

//Cyclically Rotate Array by One

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int x=a[a.length-1];

        for (int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=x;
        System.out.println(Arrays.toString(a));
    }
}
