import java.util.Scanner;
public class Q5{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		Details dt = new Details();
		dt.name(input);
		dt.marks(input);
	
	}
	static  class Details{

	void name(Scanner input){
		
		System.out.print("What is your name:");
		String name =input.next();
		System.out.println("name: "+name);
		
		}
	void marks(Scanner input){
		
		System.out.println("What is your mark 1:");
		int m1 =input.nextInt();
		System.out.println("What is your mark 2:");
		int m2 =input.nextInt();
		
		int sum = m1+m2;
		double av= sum/2;
		System.out.println("sum: "+sum);
		System.out.println("average: "+av);
		
		}	
	}
}

