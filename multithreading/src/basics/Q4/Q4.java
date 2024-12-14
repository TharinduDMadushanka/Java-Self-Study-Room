package basics.Q4;

//What are the states of a thread in Java? Write a code snippet to check the states.

public class Q4 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        });

        System.out.println("Thread State (NEW): " + t1.getState());
        t1.start(); // Thread moves to RUNNABLE
        System.out.println("Thread State (RUNNABLE): " + t1.getState());

        Thread.sleep(500);
        System.out.println("Thread State (TIMED_WAITING): " + t1.getState());

        t1.join(); // Wait for t1 to die
        System.out.println("Thread State (TERMINATED): " + t1.getState());

    }
}


