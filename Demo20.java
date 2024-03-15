//calculates the sum of all elements in an array of integers.
class Demo20{
	public static void main(String[] args){
		
		int[] list1 ={1,2,3,4};
		int[] list2 ={5,6,7,8,};
		
		int count1 =0;
		for(int i=0;i<list1.length;i++){
			count1+=list1[i];
			}
		int count2=0;
		for(int j=0;j<list2.length;j++){
			count2+=list2[j];
			}
		int sum = count1+count2;
		System.out.println(sum);	
		}
	}
