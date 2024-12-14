package basics.Q6;

//Write a program that uses join() to make a thread wait for another thread to finish.

public class Q6 {
    public static void main(String[] args) throws InterruptedException {

        WorkThread t1 = new WorkThread();
        WorkThread t2 = new WorkThread();

        t1.start();
        t1.join(); // Main thread waits for t1 to finish
        System.out.println("t1 has finished. Now starting t2...");

        t2.start();
        t2.join(); // Main thread waits for t2 to finish

        System.out.println("Both threads have finished execution.");

    }
}

class WorkThread extends Thread {

    @Override
    public void run(){

        for(int i = 0; i< 5; i++){

            System.out.println(Thread.currentThread().getName() + " working on task " + i);

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }

    }

}
