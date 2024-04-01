
public class Q16{
	public static void main(String [] args){
		
		for(int i =0;i<100;i++){
			boolean isPrime=true;
			if(i<=1){
				isPrime=false;
			}else{
				for(int j=2;j<=i;j++){
					if(i%2==0){
						isPrime=false;
					}
				}
			}
			if(isPrime){
				System.out.println(i);
			}
		}
		
	}
}
