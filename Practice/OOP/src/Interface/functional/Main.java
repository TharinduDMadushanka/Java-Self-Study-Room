package Interface.functional;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        // Using lambda expression
        Calculator add = (a, b) -> a + b;
        System.out.println(add.calculate(5, 3)); // 8

        // Using method reference
        Calculator multiply = Main::multiply;
        System.out.println(multiply.calculate(5, 3)); // 15
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
