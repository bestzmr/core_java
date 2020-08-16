package tech.aistar.day16.practice.dead;

/**
 * @author: Merlin
 * @time: 2020/8/16 8:54
 */
public class DeadLockDemo {
    public static Object oo1 = new Object();
    public static Object oo2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new T1();
        Thread t2 = new T2();
        t1.start();
        t2.start();
    }
}
class T1 extends Thread {

    private DeadLockDemo lock = new DeadLockDemo();

    @Override
    public void run() {
        System.out.println("=====1====");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (lock.oo2) {
            System.out.println("========2======");

        }
    }
}


class T2 extends Thread {
    private DeadLockDemo lock = new DeadLockDemo();

    @Override
    public void run() {
        System.out.println("=======3=======");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (lock.oo1) {
            System.out.println("========4=====");

        }
    }
}