//--------------------Test.java------------------------
class Test1{
    int a=8;
    int b=9;
}
//--------------------Demo.java------------------------
class Q2{
    public static void main(String args[]){
        Test1 t1=new Test1();
        System.out.print(t1.a);
        System.out.println(t1.b);
        //prints 89
    }
}
