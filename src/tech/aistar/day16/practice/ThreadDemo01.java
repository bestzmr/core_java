package tech.aistar.day16.practice;

/**
 * @author: Merlin
 * @time: 2020/8/13 14:48
 */
public class ThreadDemo01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(name + "->" + i);
        }
    }


}

class TestThreadDemo01 {
    public static void main(String[] args) {
        Thread t1 = new ThreadDemo01();
        Thread t2 = new ThreadDemo01();
        t1.setName("线程01");
        t2.setName("线程01");

        t1.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        System.out.println("-------stop-------");
    }
}