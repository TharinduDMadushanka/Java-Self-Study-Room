//Given user want index in a array
import java.util.Scanner;
class Demo28{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int nb =input.nextInt();
		
		int[] number={1,2,3,4,5};
		
		int index = number.length;
		
		if(index>-1 && index<index){
			
			System.out.println(number[nb]);
			}else{
				System.out.println("Invalid input.Number should be between 0 - 5.");
				}
		
		}
	}

