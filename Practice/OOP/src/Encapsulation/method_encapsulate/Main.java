package Encapsulation.method_encapsulate;

class Counter {
    // Private field
    private int count;

    // Public method to increment count
    public void increment() {
        count++;
    }

    // Public method to get count
    public int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();

        System.out.println("Count: " + counter.getCount());
    }
}

