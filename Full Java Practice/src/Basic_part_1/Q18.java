package Basic_part_1;

/**
 * Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
 */
public class Q18 {
    public static void main(String[] args) {

        System.out.println("Divide by 3: ");
        for (int i=1;i<100;i++){
            if (i%3==0){
                System.out.print(i+", ");
            }
        }

        System.out.println("\nDivide by 5: ");
        for (int i=1;i<100;i++){
            if (i%5==0){
                System.out.print(i+", ");
            }
        }

        System.out.println("\nDivide by 5 and 3: ");
        for (int i=1;i<100;i++){
            if (i%3==0 && i%5==0){
                System.out.print(i+", ");
            }
        }
    }
}
