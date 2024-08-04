package Interface.multiple_inheritance;

interface Printable {
    void print();
}

interface Showable {
    void show();
    void hide();
}

class Test implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void show() {
        System.out.println("Showing...");
    }

    @Override
    public void hide() {

    }
}

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.print(); // Printing...
        test.show();  // Showing...
    }
}
