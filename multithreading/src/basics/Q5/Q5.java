package basics.Q5;

/**
 * What is thread synchronization? Write a program to demonstrate synchronization using the synchronized keyword.
 *
 * Answer 5:
 * Synchronization ensures that multiple threads do not access shared resources simultaneously, avoiding data corruption.
 */

/**
 * The synchronized keyword ensures that only one thread can execute the increment() method at a time.
 * Without synchronization, race conditions may occur, leading to incorrect results.
 */

public class Q5 {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Runnable task = () -> {
            for(int i =0; i< 1000; i++){
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final Count: " + counter.getCount());

    }
}

class Counter{

    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }

}
