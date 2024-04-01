//maximum number of three integer numbers input by the keyboard and print results

import java.util.Scanner;
public class Q8{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		int [] nb = new int[3];
		
		System.out.print("Enter nb1:");
		int nb1 = input.nextInt();
		
		System.out.print("Enter nb2:");
		int nb2 = input.nextInt();
		
		System.out.print("Enter nb2:");
		int nb3 = input.nextInt();
		
		nb[0]=nb1;
		nb[1]=nb2;
		nb[2]=nb3;
		
		int max = nb[0];
		for(int i =0;i<nb.length;i++){
			if(nb[i]>max){
				max=nb[i];
			}
		}
		System.out.println(max);
	}
}
