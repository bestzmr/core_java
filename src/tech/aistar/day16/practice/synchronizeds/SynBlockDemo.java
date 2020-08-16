package tech.aistar.day16.practice.synchronizeds;

import java.util.concurrent.TimeUnit;

/**
 * @author: Merlin
 * @time: 2020/8/16 9:27
 */
public class SynBlockDemo implements Runnable {

    private Object obj = new Object();

    @Override
    public void run() {
        add();
    }

    private void add() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + ":" + 1);
            try {
                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + 2);
        }
    }
    public void add2() {
        synchronized (SynBlockDemo.class) {
            System.out.println(Thread.currentThread().getName() + ":" + 1);
            try {
                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + 2);
        }
    }

    public static void main(String[] args) {
        Runnable r = new SynBlockDemo();
        Thread s1 = new Thread(r);
        Thread s2 = new Thread(r);
        s1.start();
        s2.start();

    }
}
