package tech.aistar.day16.practice.daemon;

/**
 * @author: Merlin
 * @time: 2020/8/16 8:50
 */
public class DameonDemo {
    public static void main(String[] args) {
        Thread t1 = new NonDaemonDemo1();
        Thread t2 = new DaemonDemo2();
        t1.setName("数字线程");
        t2.setName("字母线程");

        t2.setDaemon(true);


        t1.start();
        t2.start();
    }
}
class NonDaemonDemo1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class DaemonDemo2 extends Thread {
    @Override
    public void run() {
        for (int i = 97; i <= 123; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}