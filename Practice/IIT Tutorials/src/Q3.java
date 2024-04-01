import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter nb of class held:");
        int held=input.nextInt();

        System.out.print("Enter nb of class attend:");
        int attend=input.nextInt();

        double percentage = (double) (attend*100)/held;
        System.out.println(percentage);

        if (percentage<75){
            System.out.println("Your attendance is low.");
            System.out.println("Do you have any medical reason? (Y/N)");
            String reason=input.next().toUpperCase();
            if (reason.equals("Y")){
                System.out.println("You can sit the exam.");
            }else if(reason.equals("N")){
                System.out.println("You cant sit the exam.");
            }else {
                System.out.println("Please enter a valid input Y or N.");
            }
        }else{
            System.out.println("You can sit the exam.");
        }
    }
}
