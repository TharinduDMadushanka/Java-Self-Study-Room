//--------------------Box.java------------------------
class Box{
    int length;
    int width;
    int height;
    void printVolume(){
        int volume;
        volume=length*width*height;
        System.out.println("Volume : "+volume);
    }
}
//--------------------Demo.java------------------------
class Q4{
    public static void main(String args[]){
        Box b1=new Box();
        b1.printVolume();
        System.out.println("length of box : "+b1.length);
        System.out.println("width of box : "+b1.width);
        System.out.println("height of box : "+b1.height);

        /**
         * Volume : 0
         * length of box : 0
         * width of box : 0
         * height of box : 0
         */
    }
}