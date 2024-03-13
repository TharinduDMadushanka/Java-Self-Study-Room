import java.util.Scanner;

class Demo16{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int nb = input.nextInt();
		int count1 =0;
		int count2=0;
		
		if(nb%2==0){
			//System.out.println("Even");
			
			for(int i = 0;i<nb;i+=2){
					count1 ++;										
				}
			System.out.println("Even "+count1);
			int odd = nb-count1;
			System.out.println("Odd "+ odd);
						
		}else if(nb%2==1){
			//System.out.println("Odd");
			for(int i=1;i<nb;i+=2){
				count2++;
			}
			System.out.println("even "+count2);
			int even = nb-count2;
			System.out.println("Odd "+ even);
		}
	}
}
