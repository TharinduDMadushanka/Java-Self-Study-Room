import java.util.Scanner;

class Demo10{
	public static void main(String [] args){
		
		Scanner input =new Scanner(System.in);
	
	System.out.println("Enter your choice");
	System.out.println("a.Get sum of 2 numbers.");
	System.out.println("b.Print full name");
	System.out.println("c.Print name 10 times");
	
	char user = input.next().charAt(0);
	
	
	switch(user){
		
		case 'a':
			System.out.print("Enter nb 1: ");
			int nb1 = input.nextInt(); 
			System.out.print("Enter nb 2: ");
			int nb2 = input.nextInt();
			int sum = nb1+nb2; 
			System.out.println(sum);
			break;
			
		case 'b':
			System.out.print("Enter first name: ");
			String fname = input.next();			
			System.out.print("Enter last name: ");
			String lname = input.next();
			System.out.println(fname+" "+lname );
			break;
			
		case 'c':
			System.out.println("Enter first name: ");
			String s = input.next();				
			for(int i = 1;i<10;i++){
			
				System.out.println(s);
			}
			break;
		   
	  }	
	}
}	

