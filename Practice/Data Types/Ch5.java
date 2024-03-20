//BMI Calculator
import java.util.Scanner;
class Ch5{
	public static void main(String[] args){
		
		
			
			Scanner input=new Scanner(System.in);
			
			System.out.print("Enter your weight:");
			double weight =input.nextDouble();
			
			System.out.print("Enter your height:");
			double height =input.nextDouble();
			
			
			double bmi = weight / (height * height);
			
			System.out.println("Your BMI is: "+bmi);
				
			
		
		}
	}
