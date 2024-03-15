//reverses the elements of an array.
import java.util.Arrays;
class Demo24{
	public static void main(String [] args){
		
		int[] number={1,2,3,4,5};
		System.out.println(number.length);
		revereArray(number);
		System.out.println(Arrays.toString(number));
		
		}
		public static void revereArray(int[] array){
			int length=array.length;
			for(int i =0;i<length/2;i++){// Iterate only till the midpoint
				int temp=array[i];
				array[i]=array[length - 1 - i];// Assign last element to current position
				array[length - 1 - i]=temp;// Assign temp value (original current element) to last position
				
				}
			}
	}
