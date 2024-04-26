package ArraysBasics;

// Array Intersection

public class Q13 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int[] b={1,3,7,8,9,10,11,5,6,12};

        for (int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                if (a[i]==b[j]){
                    System.out.print(a[i]+",");
                }
            }
        }
    }
}
