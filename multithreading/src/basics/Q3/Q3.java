package basics.Q3;

//Write a program where two threads print numbers from 1 to 5 in sequence.

public class Q3 {

    public static void main(String[] args){

        NumberPrinter t1 = new NumberPrinter("Thread 1");
        NumberPrinter t2 = new NumberPrinter("Thread 2");

        t1.start();
        t2.start();

    }

}

class NumberPrinter extends Thread{

    private String threadName;

    public NumberPrinter(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run(){

        for(int i = 0; i < 5; i++){
            System.out.println(threadName+ " prints: "+ i);

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

}
