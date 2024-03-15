import java.util.Arrays;
class Demo25{
	public static void main(String[] args){
		
		String[] names = {"amal","kamal","nimal","nimal","pathum"};
		System.out.println(names.length);
		reveresArray(names);
		System.out.println(Arrays.toString(names));
		}
		public static void reveresArray(String[] array){
			int length=array.length;
			for(int i=0;i<length/2;i++){
				String tem=array[i];
				array[i]=array[length-1-i];
				array[length-1-i]=tem;
				}
			}
	}
