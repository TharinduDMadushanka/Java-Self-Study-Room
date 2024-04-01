//Write a Java program to generate random numbers between 0 to 100 and print only the odd numbers.

import java.util.Random;
public class Q14{
	public static void main(String [] args){
		Random r = new Random();
		
		for(int i =0;i<100;i++){
			int a = r.nextInt(100);
			if(a%2==1){
				System.out.println(a);
			}
		}
	}
}
