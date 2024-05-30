package Basic_part_1;

public class Q22 {
    public static void main(String[] args) {
        int [] arr1 ={1,2,3,4,5};
        int [] arr2 ={3,4,5,6,7};

        for (int i=0;i<arr1.length;i++) {
            if (arr1[i]==arr2[i]){
                System.out.println("same");
            }
        }
    }
}
