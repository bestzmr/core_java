package tech.aistar.day16.practice.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Merlin
 * @time: 2020/8/16 9:05
 */
public class LockDemo02 {
    private Lock lock = new ReentrantLock();

    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    private int count = 0;
    private void printLower() {
        lock.lock();
        try {
            while (true) {
                if (count != 0) {
                    c1.await();

                }
                System.out.println("abc");

                Thread.sleep(500);
                count = 1;
                c2.signal();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }finally {
            lock.unlock();

        }
    }
    public void printUpper() {
        while (true) {
            lock.lock();
            try {
                if (count != 1) {
                    c2.await();

                }
                System.out.println("ABC");
                Thread.sleep(500);

                count = 2;
                c3.signal();

            } catch (InterruptedException e) {

                e.printStackTrace();
            }finally {
                lock.unlock();

            }
        }
    }

    public void printNum() {
        while (true) {
            lock.lock();
            try {
                if (count != 2) {
                    c3.await();

                }
                System.out.println("123");
                Thread.sleep(500);
                count = 0;
                c1.signal();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();

            }
        }
    }

    public static void main(String[] args) {
        LockDemo02 demo = new LockDemo02();
        Thread t1 = new Thread(() -> {
            demo.printLower();
        });
        Thread t2 = new Thread(() -> {
            demo.printUpper();
        });
        Thread t3 = new Thread(() -> {
            demo.printNum();
        });
        t1.start();
        t2.start();
        t3.start();

    }
}
