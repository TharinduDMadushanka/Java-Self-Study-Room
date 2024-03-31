//Find user is 'Pass' or 'Fail' using isPass --> bool method
import java.util.Scanner;

public class Q247 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input average marks : ");
        double avg = scanner.nextDouble();

        if (isPass(avg)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
    public static boolean isPass(double avg){
        Boolean pass = true;
        if (avg>=50){
            return pass;
        }else {
            pass=false;
            return pass;
        }
    }
}