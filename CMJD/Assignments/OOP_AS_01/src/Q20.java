class Box1 {
    int length;
    int width;
    int height;

    {
        System.out.println("A box object is created..");
    }
}

class Q20 {
    public static void main(String args[]) {
        Box1 b1 = new Box1();
        Box1 b2 = new Box1();
    }
}