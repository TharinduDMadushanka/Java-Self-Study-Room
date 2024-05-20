class Test3{
    int x=10;
    static int y=20;
    Test3(int i, int j){ x=i; y=j; }
    void printXY(){
        System.out.print(x+" "+y+" ");
    }
}
class Q16{
    public static void main(String args[]){
        Test3 t1=new Test3(1,2);
        Test3 t2=new Test3(10,20);
        Test3 t3=new Test3(100,200);
        t1.printXY();
        t2.printXY();
        t3.printXY();
    }
}