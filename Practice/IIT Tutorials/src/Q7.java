import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a nb:");
        int nb =input.nextInt();

        int fact =1;
        while(nb!=0){
            fact*=nb;
            nb--;
        }
        System.out.println(fact);
    }
}
