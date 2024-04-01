//Prime numbers
import java.util.Scanner;

public class Q6{
	public static void main(String [] args){
		
		for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % 2 == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(i + " is prime");
            }
        }
	}
}
