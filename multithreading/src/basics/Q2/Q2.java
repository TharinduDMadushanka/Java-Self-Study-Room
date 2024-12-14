package basics.Q2;

public class Q2 {

    public static void main(String[] args){
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        t1.start();
        System.out.println("Main thread is running: "+ Thread.currentThread().getName());
    }

}

class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("MyThread is running: " + Thread.currentThread().getName());
    }
}
