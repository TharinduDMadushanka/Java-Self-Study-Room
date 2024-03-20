//Leap Year Checker

import java.util.Scanner;
class Ch7{
	public static void main(String [] args){
		
		Scanner input =new Scanner(System.in);
		
		
		
		while(true){
			
		System.out.print("Enter a year:");
		int year =input.nextInt();
			
		if(year%4==0 && year%100!=0){
			System.out.println(year+" is a Leap year!");
			break;
			}else if(year%400==0){
				System.out.println(year+" is a Leap year!");
				break;
				}else{
					System.out.println(year+" is not a leap year!");
					}
		}
		}
	}
