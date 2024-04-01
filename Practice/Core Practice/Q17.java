//find the factorial of a given integer number.
import java.util.Scanner;
public class Q17{
	public static void main(String [] args){
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter a Integer:");
		int nb = input.nextInt();
		
		int fact =1;
		while(nb!=0){
			fact*=nb;
			nb--;
		}
		System.out.println(fact);
	}
}
