//Find factorial of Random Numbers
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random  = new Random();

        for (int i=0;i<10;i++){
            int rand = random.nextInt(10)+1;
            System.out.println("Factorial of: "+rand+":"+ fact(rand));
        }
    }
    public static int fact(int num){
        int fact = 1;
        while (num>0){
            fact *=num--;
        }
        return fact;
    }
}