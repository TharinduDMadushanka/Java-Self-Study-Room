import java.util.Random;

class Demo4{
	public static void main(String [] args){
		
		Random r=new Random(); 
		
		int a = r.nextInt(1001);
		System.out.println(a);
		
		if(a%2==0){
			System.out.println("Even");
			}else{
				System.out.println("Odd");
			}
		}
	}
