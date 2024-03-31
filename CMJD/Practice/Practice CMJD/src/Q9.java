//Prime number
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number:");
        int nb = input.nextInt();

        int count =0;

        for (int i =1;i<=nb;i++){ //i<=nb his should be in this format
            if(nb%i==0){
                count++;
            }
        }

        if (count == 2){
            System.out.println("Prime");
        }else {
            System.out.println("Not prime");
        }
    }
}
