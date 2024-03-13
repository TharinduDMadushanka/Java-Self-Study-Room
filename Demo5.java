import java.util.Scanner;

class Demo5{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sb 1 marks: ");
		int sub1 = input.nextInt();
		
		System.out.println("Sb 2 marks: ");
		int sub2 = input.nextInt();
		
		double ave = (sub1+sub2)/2;
		
		System.out.println(ave);
		}
	}
