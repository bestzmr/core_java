package tech.aistar.day16.practice.synchronizeds;

/**
 * @author: Merlin
 * @time: 2020/8/16 9:32
 */
public class SynMethod implements Runnable{
    public synchronized void add() {
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
        add();
    }

    public static void main(String[] args) {
        Runnable r1 = new SynMethod();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);

        t1.start();
        t2.start();
        t3.start();
    }
}
