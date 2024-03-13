import java.util.Random;

class Demo8{
	public static void  main(String [] args){
		
		//double min = 100;
		//double max=1000;
		
		Random r = new Random();
		int range = r.nextInt(1000);
		
		
		if(range>500){
			System.out.println("Alarm!..");
			}else{
			System.out.println("Fine");	
			}
		}
	}
