class Box3{
    int length;
    int width;
    int height;
    static{
        System.out.println("Box is loaded into memory");
    }
    {
        System.out.println("A box object is created..");
    }
}
class Q21{
    public static void main(String args[]){
        Box3 b1=new Box3();
        Box3 b2=new Box3();
        Box3 b3=new Box3();
    }
}