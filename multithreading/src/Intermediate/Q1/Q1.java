package Intermediate.Q1;

//Write a program to demonstrate a deadlock situation using two threads and two resources.

//Two threads try to lock resources in opposite order, causing a deadlock.
public class Q1 {
    public static void main(String[] args) {

        DeadlockExample example = new DeadlockExample();

        Thread t1 = new Thread(example::method1, "Thread-1");
        Thread t2 = new Thread(example::method2, "Thread-2");

        t1.start();
        t2.start();

    }
}

class DeadlockExample {

    private final Object object1 = new Object();
    private final Object object2 = new Object();

    public void method1(){
        synchronized (object1) {
            System.out.println(Thread.currentThread().getName() + " locked resource1");

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            synchronized (object2) {
                System.out.println(Thread.currentThread().getName() + " locked resource2");
            }

        }
    }

    public void method2(){
        synchronized (object2) {
            System.out.println(Thread.currentThread().getName() + " locked resource2");

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            synchronized (object1) {
                System.out.println(Thread.currentThread().getName() + " locked resource1");
            }
        }
    }

}
