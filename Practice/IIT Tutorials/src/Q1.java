import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        final int Manual = 500;
        final int Skill =700;
        final int Management =800;

        System.out.println("Enter the nb of Manual Employee:");
        int man = input.nextInt();
        System.out.println("Enter the nb of Skill Employee:");
        int ski =input.nextInt();
        System.out.println("Enter the nb of Management Employee:");
        int manga =input.nextInt();

        int bill =(Manual*man)+(Skill*ski)+(Management*manga);

        double tax =bill*0.2;
        System.out.println("The wage bill is: "+bill);
        System.out.println("The wage bill is with tax: "+ (bill+tax));
        System.out.println(tax);

    }
}
