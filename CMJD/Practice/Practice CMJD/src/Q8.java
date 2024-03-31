//Factorial number
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int nb = input.nextInt();

        int fact=1;//This should be 1 because nb!= 0
        while (nb!=0){
            fact*=nb;
            --nb;
        }
        System.out.println(fact);
    }
}
