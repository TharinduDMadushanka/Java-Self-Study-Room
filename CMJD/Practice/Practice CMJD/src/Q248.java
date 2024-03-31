//check Random numbers even or odd
import java.util.Random;

public class Q248 {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i< 10; i++){
            int rand = random.nextInt(101);
            System.out.println(rand + " : " + (isEven(rand) ? "Even" : "Odd"));//Ternary operator
        }
    }
    public static boolean isEven(int rand){
        Boolean even=true;
        if (rand%2==0){
            return even;
        }else {
            even =false;
            return even;
        }
    }
}
