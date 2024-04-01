//1 to 100 without using a loop. 
public class Q10 {
    public static void main(String[] args) {
        printNumbers(1);
    }

    public static void printNumbers(int n) {
        if (n <= 100) {
            System.out.println(n);
            printNumbers(n + 1);
        }
    }
}
