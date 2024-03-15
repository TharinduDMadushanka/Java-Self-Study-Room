// Create arrays
class Demo17{
	public static void main(String [] args){
		
		int[] number = {1,2,3,4,5}; // create int type array
		String[] names = {"amal","kamal","nimal"}; // create string type array
		
		System.out.println(number[0]);// acces 1st index of number array
		System.out.println(names [0]);
		
		number[0] = 6;
		names[0]= "namal";
		
		System.out.println(number[0]);// change 1st index of number array
		System.out.println(names [0]);
		
		System.out.println(number.length); //Get length of number array
		}
	}
