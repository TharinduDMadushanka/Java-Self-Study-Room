package ticketing_system; // Defines the package name for this ticketing system class

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TicketingSystem {

    // Maximum number of tickets available at any given time in the queue
    private static final int TICKET_CAPACITY = 50;

    // A thread-safe queue to hold tickets, with a fixed capacity (TICKET_CAPACITY)
    private static final BlockingQueue<String> ticketQueue = new ArrayBlockingQueue<>(TICKET_CAPACITY);

    public static void main(String[] args) {

        // Create a new thread for the TicketProducer, which releases tickets to the queue
        Thread producerThread = new Thread(new TicketProducer());

        // Create multiple threads for TicketConsumers, each representing a different customer
        Thread consumerThread1 = new Thread(new TicketConsumer("Customer1"));
        Thread consumerThread2 = new Thread(new TicketConsumer("Customer2"));
        Thread consumerThread3 = new Thread(new TicketConsumer("Customer3"));

        // Start the producer and consumer threads to begin ticketing operations
        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();
        consumerThread3.start();
    }

    // Inner class for the TicketProducer, which acts as an event organizer releasing tickets
    static class TicketProducer implements Runnable {
        @Override
        public void run() {
            int ticketId = 1; // Unique ID for each ticket

            try {
                while (true) { // Loop indefinitely to keep releasing tickets in batches
                    // Release a new batch of 10 tickets
                    for (int i = 0; i < 10; i++) {
                        String ticket = "Ticket-" + ticketId++; // Generate a unique ticket ID
                        ticketQueue.put(ticket); // Add the ticket to the queue, blocking if full
                        System.out.println("Released " + ticket); // Print ticket release confirmation
                    }
                    Thread.sleep(5000); // Pause for 5 seconds before releasing the next batch
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted state
            }
        }
    }

    // Inner class for TicketConsumer, representing customers trying to purchase tickets
    static class TicketConsumer implements Runnable {
        private final String customerName; // Name of the customer

        public TicketConsumer(String customerName) {
            this.customerName = customerName; // Assign customer name when creating a consumer instance
        }

        @Override
        public void run() {
            try {
                while (true) { // Loop indefinitely to keep trying to purchase tickets
                    // Attempt to purchase a ticket from the queue
                    String ticket = ticketQueue.take(); // Take a ticket from the queue, blocking if empty
                    System.out.println(customerName + " purchased " + ticket); // Confirm purchase
                    Thread.sleep(1000); // Pause for 1 second to simulate purchase processing time
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted state
            }
        }
    }
}
