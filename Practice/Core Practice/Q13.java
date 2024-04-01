//Write a Java program to print 10 random numbers between 0 to 100.
import java.util.Random;
public class Q13{
	public static void main(String [] args){
		Random r = new Random();
		
		for(int i =0;i<10;i++){
			int a = r.nextInt(100);
			System.out.println(a);
		}
	}
}
