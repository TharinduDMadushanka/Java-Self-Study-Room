/**
//--------------------Box.java------------------------
class Box{
    int length;
    int width;
    int height;
    Box(){
        System.out.println("default constructor");
        length=2;
        width=2;
        height=2;
    }
}
//--------------------Demo.java------------------------
class Q5{
    public static void main(String args[]){
        Box b1=new Box();
        System.out.println("length of box : "+b1.length);
        System.out.println("width of box : "+b1.width);
        System.out.println("height of box : "+b1.height);
    }
}
 */