package ArraysBasics;

//Search a give value index in Array

public class Q3 {
    public static void main(String[] args) {
        int[] a ={12,34,56,78,90,10};
        Q3 obj = new Q3();
        int i= obj.searchIndex(a,10);
        System.out.println(i);
    }

    public int searchIndex(int[] a, int val) {
        if (a.length == 0) {
            return -1;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==val){
                return i;
            }
        }
        return -1;
    }
}
