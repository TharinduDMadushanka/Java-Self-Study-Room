//factorial of a number using a loop.
import java.util.Scanner;
public class Q4{
	public static void main(String [] args){
		Scanner input =new Scanner(System.in); 
		
		System.out.print("Enter an integer:");
		int nb = input.nextInt();
		
		int fact=1;
		while(nb!=0){
				fact*=nb;
				nb--;
				
			}
		System.out.println(fact);	
	}
}
