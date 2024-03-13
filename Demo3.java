import java.util.Scanner;

class Demo3{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a numbet: ");
		int nb=input.nextInt();
		
		if(nb%2==0){
			System.out.println("Even");
			}else{
				System.out.println("Odd");
			}
		}
	}
