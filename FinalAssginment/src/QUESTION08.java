/*
 * Write a Java program that creates two threads. The first thread should print even
     numbers between 1 and 10, and the second thread should print odd numbers
     between 1 and 10.
 */
public class QUESTION08 {
    public static void main(String[] args)
    {
    	
        Thread evenThread = new Thread(new EvenNumberPrinter());
        Thread oddThread = new Thread(new OddNumberPrinter());

        evenThread.start();
        oddThread.start();
    }
}

class EvenNumberPrinter implements Runnable {
    
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }
}

class OddNumberPrinter implements Runnable {
  
    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }
}