
public class Q2{
	public static void main(String [] args){
		Temp t = new Temp();
		t.Test();
		t.Test(5);
		t.Test(5,6);	
		
	}				
}
class Temp{
	
	void Test(){
		
		System.out.println("Constructor without parameters");
		}
	void Test(int x){
		
		System.out.println("Hi 1");
		System.out.println("x: " + x);
		}
	void Test(int x, int y){
		int c =x*y;
		System.out.println("Hi 2");
		System.out.println(c);
		}
	}
