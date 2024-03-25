
/*
import java.util.Scanner;
class C1{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input Student Marks : ");
		double marks = input.nextDouble();

		if(marks >= 50){
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
*/
import java.util.Scanner;

class C1{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input Marks : ");
		double marks = scanner.nextDouble();

		if(marks >= 75){
			System.out.println("Grade A");
		}

		if(marks >= 65){
			System.out.println("Grade B");
		}

		if(marks >= 50){
			System.out.println("Grade C");
		}

		if(marks >= 35){
			System.out.println("Grade S");
		} else {
			System.out.println("Grade F");
		}


	}
}
