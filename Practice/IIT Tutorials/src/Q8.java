import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] a1 = new int[7];

        System.out.println("Enter marl 1:");
        int nb1 = input.nextInt();

        System.out.println("Enter marl 2:");
        int nb2 = input.nextInt();

        System.out.println("Enter marl 3:");
        int nb3 = input.nextInt();

        System.out.println("Enter marl 4:");
        int nb4 = input.nextInt();

        System.out.println("Enter marl 5:");
        int nb5 = input.nextInt();

        System.out.println("Enter marl 6:");
        int nb6 = input.nextInt();

        a1[0]=nb1;
        a1[2]=nb2;
        a1[3]=nb3;
        a1[4]=nb4;
        a1[5]=nb5;
        a1[6]=nb6;

        int fail = 0;

        for (int i=0;i<a1.length;i++){
            if (a1[i]<40){
                fail++;
                System.out.println(fail);
            }else {
                System.out.println("Pass");
            }
        }
    }
}
