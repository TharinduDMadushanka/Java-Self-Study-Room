package Basic_part_1;

/**
 * Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
 */
public class Q18 {
    public static void main(String[] args) {

        for (int i=0;i<100;i++){
            if (i%3==0){
                System.out.println("Divide by 3: ");
                System.out.println(i);
            }else if (i%5==0){
                System.out.println("Divide by 5: ");
                System.out.println(i);
            }
        }
    }
}
