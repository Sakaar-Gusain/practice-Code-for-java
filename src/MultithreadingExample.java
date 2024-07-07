class Counter {
    private int count = 0;

    // Synchronized method to avoid race conditions
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            System.out.println(Thread.currentThread().getName() + " - Count: " + counter.getCount());
            try {
                Thread.sleep(100); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        Counter sharedCounter = new Counter();

        // Creating two threads
        IncrementThread thread1 = new IncrementThread(sharedCounter);
        IncrementThread thread2 = new IncrementThread(sharedCounter);

        // Starting the threads
        thread1.start();
        thread2.start();

        // Waiting for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Displaying the final count
        System.out.println("Final Count: " + sharedCounter.getCount());
    }
}