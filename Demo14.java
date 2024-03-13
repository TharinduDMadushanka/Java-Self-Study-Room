import java.util.Scanner;

class Demo14{
	public static void main(String [] args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1st nb: ");
		int nb1 = input.nextInt();
		
		System.out.println("Enter 2nd nb: ");
		int nb2 = input.nextInt();
		
		int max=nb1;
		int min=nb2;
				
		if(nb1<nb2){
			max = nb2;
			min = nb1;
		}else if(nb2<nb1){
			max =nb1;
			min=nb2;
			}
		System.out.println(max);
		
		for(int i=min;i<max+1; i++){
				System.out.println(i);
			}
	}
}
