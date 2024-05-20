class Test2{
    int a=3;
    int b=4;
    Test2(int i,int j){a=i;b=j;}
    Test2(){}
}
class Q8{
    public static void main(String args[]){
        Test2 t1=new Test2(1,2);
        System.out.print(t1.a+" "+t1.b+" ");

        Test2 t2=new Test2();
        System.out.println(t2.a+" "+t2.b);
    }
}