package tech.aistar.day16.practice.synchronizeds;

/**
 * @author: Merlin
 * @time: 2020/8/16 9:34
 */
public class SynThreadMethod extends Thread {
    public synchronized void add() {
        System.out.println(Thread.currentThread().getName() + ":" + 1);
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ":" + 2);
    }

    public synchronized static void add2() {
        System.out.println(Thread.currentThread().getName() + ":" + 1);
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ":" + 2);
    }
    @Override
    public void run() {

        add2();
    }

    public static void main(String[] args) {
        Thread t1 = new SynThreadMethod();
        Thread t2 = new SynThreadMethod();
        Thread t3 = new SynThreadMethod();
        t1.start();
        t2.start();
        t3.start();

    }
}
