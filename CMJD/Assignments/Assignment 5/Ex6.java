//Write a Java program to generate random numbers between 0 to 100 and print only the odd numbers.

import java.util.Random;
class Ex6{
	public static void main(String [] args){
		
		Random rand = new Random();

        int rd = rand.nextInt(100);

        if(rd%2==1){
            System.out.println(rd);
        }else {
            System.out.println();
        }
	
	}
	
}
