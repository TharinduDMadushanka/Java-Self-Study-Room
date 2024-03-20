//Grade Calculator

import java.util.Scanner;
class Ch4{
	public static void main(String[] args){
		
		Scanner input =new Scanner(System.in);
		
		while (true) {
            System.out.print("Enter your exam marks ('q'to exit): ");
            double marks = input.nextDouble();

            // Check if the user wants to exit
            if (marks == 'q') {
                System.out.println("Exiting program...");
                break; // Exit the loop
            }
				
		if(marks >=90 && marks<=100){
			System.out.println("You got A pass.");
			}else if(marks >=80 && marks<=89){
					System.out.println("You got B pass.");
				}else if(marks >=70 && marks<=79){
						System.out.println("You got C pass.");
					}else if(marks >=60 && marks<=69){
							System.out.println("You got D pass.");
						}else if (marks<60){
							System.out.println("You got F pass.");
							}else{
								System.out.println("Marks should be in 0-100. ");
								}
		
		}
	}
}
