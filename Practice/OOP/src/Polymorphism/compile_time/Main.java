package Polymorphism.compile_time;

class MathOperations {
    // Method with two int parameters
    public static int add(int a, int b) {
        return a + b;
    }

//    public int add(int a, int b) {
//        return a + b;
//    }

    public String add(String a, char b) {
        return a + b;
    }

    // Method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Sum of two integers: " + math.add(5, 10)); // Calls add(int, int)
        System.out.println("Sum of three integers: " + math.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println("Sum of two doubles: " + math.add(5.5, 10.5)); // Calls add(double, double)

        System.out.println(MathOperations.add(10, 5));
    }
}
