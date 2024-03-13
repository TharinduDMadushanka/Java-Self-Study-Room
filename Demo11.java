import java.util.Scanner;

class Demo11{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter nb of m: ");
	int nb = input.nextInt();
	
	//String s = "u"+"m"*nb+"a";
	System.out.print("u");
	for(int i=0;i<nb;i++){
		System.out.print("m");
		}
	
	System.out.print("a");
		
	}
}
