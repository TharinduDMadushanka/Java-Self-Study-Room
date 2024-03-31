//Check Palindrome numbers

public class Q249 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (isPalindrome(i)) { // 11 -> 11, 101 -> 101, 1221 -> 1221
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int num) {
        int temp =num;
        int rev =0;

        while (temp!=0){
            rev*=10;
            rev+=(temp%10);
            temp/=10;
        }
        return rev==num;
    }
}
