package tech.aistar.day16.practice;

/**
 * @author: Merlin
 * @time: 2020/8/13 16:00
 */
public class VolatileDemo {
    private volatile int x = 0;
    private void writeX() {
        x = 5;
    }
    private void readX() {
        while (x != 5) {
            System.out.println();
        }
        if (x == 5) {
            System.out.println("----stopped-----");
        }
    }
    public static void main(String[] args) {
        VolatileDemo v = new VolatileDemo();
        Thread t1 = new Thread(() -> v.writeX());
        Thread t2 = new Thread(() -> v.readX());
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();

    }
}
