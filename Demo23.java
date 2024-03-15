//minimum element in an array
class Demo23{
	public static void main(String [] args){
		
		int[] number={1,2,3,4,5,-1};
		int min=number[0];
		
		for(int i=0;i<number.length;i++){
			if(number[i]<min){
				min=number[i];
				}
			}
		System.out.println(min);
		}	
	}

