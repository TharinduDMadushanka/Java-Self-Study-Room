package Intermediate.Q2;

//Write a program where one thread produces data and another thread consumes it using wait() and notify().

//The produce method generates data, and the consume method processes it.
//wait() makes the thread pause until notify() wakes it up.

public class Q2 {
    public static void main(String[] args) {

        ProducerConsumer pc = new ProducerConsumer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    pc.produce();
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    pc.consume();
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();

    }
}

class ProducerConsumer{

    private int data;
    private boolean isPurchased = false;

    public synchronized void produce() throws InterruptedException {

        while(isPurchased){
            wait();
        }

        data = (int) (Math.random() * 100);
        System.out.println("Produced data: " + data);
        isPurchased = true;
        notify();

    }

    public synchronized void consume() throws InterruptedException {
        while(!isPurchased){
            wait();
        }

        System.out.println("Consumed data: " + data);
        isPurchased = false;
        notify();
    }

}
