package tech.aistar.day16.practice.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Merlin
 * @time: 2020/8/16 9:00
 */
public class LockDemo extends Thread {

    private Lock lock = new ReentrantLock();
    public void add() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + ":" + 1);
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + ":" + 2);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }finally {
            lock.unlock();

        }
    }

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        LockDemo demo = new LockDemo();
        Thread t1 = new Thread(() -> {
            demo.add();

        });
        t1.setName("one");

        Thread t2 = new Thread(()->{
            demo.add();
        });

        t2.setName("two");
        t1.start();
        t2.start();
    }
}
