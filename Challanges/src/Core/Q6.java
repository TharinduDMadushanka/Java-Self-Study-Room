package Core;

// Reverse String Approach 2
public class Q6 {
    public static void main(String[] args) {
        String str = "Hello";
        char[] ar = str.toCharArray();

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
