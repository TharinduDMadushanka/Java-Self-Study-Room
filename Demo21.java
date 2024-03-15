//computes the average of elements in an array
class Demo21{
	public static void main(String [] args){
		
		int[] number={1,2,3,4,5};
		
		int count =0;
		for(int i =0;i<number.length;i++){
			count+=number[i];
			}
		int ave =count/number.length;
		System.out.println(ave);	
		}
	}
