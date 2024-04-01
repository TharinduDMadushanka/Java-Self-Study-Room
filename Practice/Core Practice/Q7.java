//find the absolute number of a given integer number.
import java.util.Scanner;
public class Q7{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int nb = input.nextInt();
		
		if(nb<0){
			nb= -(nb);
			System.out.println(nb);	
		}else{
			System.out.println(nb);
		}
	}
}
