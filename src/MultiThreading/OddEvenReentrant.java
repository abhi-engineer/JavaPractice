package MultiThreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OddEvenReentrant {

    private int count = 1;
    private final int MAX = 10;
    private final Lock lock = new ReentrantLock();
    private final Condition oddCondition = lock.newCondition();
    private final Condition evenCondition = lock.newCondition();

    public void printOdd() {
        while (count <= MAX) {
            lock.lock();
            try {
                while (count % 2 == 0) {
                    oddCondition.await();
                }
                System.out.println("Odd: " + count++);
                evenCondition.signal(); // wake even thread
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.unlock();
            }
        }
    }

    public void printEven() {
        while (count <= MAX) {
            lock.lock();
            try {
                while (count % 2 != 0) {
                    evenCondition.await();
                }
                System.out.println("Even: " + count++);
                oddCondition.signal(); // wake odd thread
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        OddEvenReentrant printer = new OddEvenReentrant();

        Thread t1 = new Thread(printer::printOdd);
        Thread t2 = new Thread(printer::printEven);

        t1.start();
        t2.start();

    }
}
