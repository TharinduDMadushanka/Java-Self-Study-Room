//Number Guesing game
import java.util.*;

class Ch6{
	public static void main(String[] args){
		
		Scanner input =new Scanner(System.in);
		Random randomNb =new Random();
		
		int randNb=randomNb.nextInt(101);
		System.out.println(randNb);
		
		while(true){
			System.out.print("Gues numbet between 0 and 100: ");
			int nb = input.nextInt();
			
			if(nb==randNb){
				System.out.println("You win!!");
				break;
				}else if(nb<randNb){
					System.out.println("You lose!.Too low");
					}else if(nb>randNb){
						System.out.println("You lose!.Too high");
						}else{
							System.out.println("Enter a nb between 0-100.");
							}
			
			}
		
		}
	}
