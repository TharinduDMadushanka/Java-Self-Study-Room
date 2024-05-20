class Box{
    int length;
    int width;
    int height;
    static{
        System.out.println("Box is loaded into memory");
    }
}
class Q19{
    public static void main(String args[]){
        Box b1=new Box();
    }
}