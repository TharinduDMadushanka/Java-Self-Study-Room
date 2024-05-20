class Item{
    int code;
    Item(int i){
        code=i;
    }
    void printCode(int code){
        System.out.println("Code : "+code);
    }
}
class Q10{
    public static void main(String args[]){
        Item t1=new Item(2001);
        t1.printCode(3001);
    }
}