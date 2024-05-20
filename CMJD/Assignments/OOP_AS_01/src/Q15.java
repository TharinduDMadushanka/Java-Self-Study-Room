public class Q15 {
    public static void main(String[] args) {

        Rectangle r1=new Rectangle(10,15);
        r1.calcArea();
    }
}

class Rectangle{

    private double length=1.0;
    private double width=2;

    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void calcArea(){
        if (length>0.0 && width<20.0){
            double area=width*length;

            System.out.println(area);
        }
    }
}
