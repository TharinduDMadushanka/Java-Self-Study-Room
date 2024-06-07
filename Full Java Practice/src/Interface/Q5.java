package Interface;

/**
 * Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height)
 * that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.
 */
public class Q5 {
    public static void main(String[] args) {

        Rectangle1 r =new Rectangle1(100,150);
        r.printSize();

        r.resizeHeight(500);
        r.resizeWidth(600);
        r.printSize();
    }
}
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle1 implements Resizable {

    private int width;
    private int height;

    public Rectangle1(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void resizeWidth(int width) {
        this.width = width;
    }
    public void resizeHeight(int height) {
        this.height = height;
    }
    public void printSize(){
        System.out.println(width + "x" + height);
    }
}
