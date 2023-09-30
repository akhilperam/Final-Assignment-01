import java.util.LinkedList;
import java.util.Random;
import java.util.Queue;

class ProducerConsumer {
    private Queue<Integer> queue;
    private final int MAX_SIZE;
    private static final int MAX_RANDOM_NUMBER = 1000;

    public ProducerConsumer(int maxSize) {
        this.queue = new LinkedList<>();
        this.MAX_SIZE = maxSize;
    }

    public synchronized void produce() throws InterruptedException {
        while (queue.size() == MAX_SIZE) {
            wait();
        }

        Random random = new Random();
        int number = random.nextInt(MAX_RANDOM_NUMBER);
        queue.add(number);
        System.out.println("Produced: " + number);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }

        int number = queue.remove();
        System.out.println("Consumed: " + number);
        notifyAll();
    }
}

class Producer implements Runnable {
    private ProducerConsumer producerConsumer;

    public Producer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                producerConsumer.produce();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private ProducerConsumer producerConsumer;

    public Consumer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                producerConsumer.consume();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class QUEDSTION09 {
    public static void main(String[] args) {
        int maxSize = 5;
        ProducerConsumer producerConsumer = new ProducerConsumer(maxSize);

        Thread producerThread = new Thread(new Producer(producerConsumer));
        Thread consumerThread = new Thread(new Consumer(producerConsumer));

        producerThread.start();
        consumerThread.start();
    }
}