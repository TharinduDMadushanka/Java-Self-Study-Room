package Core;

// Reverse a giver string

// Approach 1
public class Q4 {
    public static void main(String[] args) {
        String str ="Hello";
        char[] ar =str.toCharArray();
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(ar[i]);
        }
    }
}
