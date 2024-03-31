//Find user's Grade using if ladder
import java.util.Scanner;

public class Q246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input average marks : ");
        double avg = scanner.nextDouble();

        char grade = findGrade(avg);
        System.out.println("Grade : " + grade);

    }
    public static char findGrade(double avg){
        if (avg>=75){
            return 'A';
        } else if (avg>=65) {
            return 'B';
        } else if (avg>=55) {
            return 'C';
        } else if (avg>=35) {
            return 'S';
        }else {
            return 'F';
        }
    }
}
