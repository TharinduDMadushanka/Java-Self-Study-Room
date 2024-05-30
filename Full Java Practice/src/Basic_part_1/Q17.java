package Basic_part_1;

/**
 * Write a Java program to print odd numbers from 1 to 99. Prints one number per line.
 */
public class Q17 {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            if (i%2==1){
                System.out.println(i);
            }
        }
    }
}
