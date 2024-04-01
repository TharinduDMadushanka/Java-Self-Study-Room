//Write a Java program to find the sum of two numbers entered by the user.
import java.util.Scanner;
public class Q3{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your 1st nb:");
		int nb1 = input.nextInt();
		
		System.out.print("Enter your 2nd nb:");
		int nb2 = input.nextInt();
		
		int sum = nb1 + nb2;
		System.out.println("Sum is: "+sum);
	}
}
