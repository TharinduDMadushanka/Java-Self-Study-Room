package basics.Q1;

//Write a simple Java program to create and start a thread by extending the Thread class.

public class Q1 {
    public static void main(String[] args){

        ThreadExample t1 = new ThreadExample();
        t1.start();
        System.out.println("main thread 1 started");

        ThreadExample t2 = new ThreadExample();
        t2.start();
        System.out.println("main thread 2 started");

    }
}

class ThreadExample extends Thread{

    @Override
    public void run(){
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }

}
