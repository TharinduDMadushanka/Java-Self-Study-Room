package Lambda_Expression;

/**
 * Write a Java program to implement a lambda expression to find the sum of two integers.
 */
public class Q1 {
    public static void main(String[] args) {

        Sum sumCalc=(x,y)->x+y;
        int result= sumCalc.sum(7,6);
        System.out.println(result);
    }
}
interface Sum {
    int sum(int a, int b);
}
