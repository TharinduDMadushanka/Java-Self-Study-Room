public class Rectangle {
    double length; //Instance variable
    double width;
    //int count =0; //instance var
    static int count=0; //instance var ---> class var

    public Rectangle(){ // default constructor
        length =5;
        width=2;
        count++;
    }

    public Rectangle(double length,double width){ // parametrize constructor
        this.length=length;
        this.width=width;
        count++;
    }

    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
}
