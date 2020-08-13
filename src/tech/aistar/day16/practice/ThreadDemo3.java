package tech.aistar.day16.practice;

/**
 * @author: Merlin
 * @time: 2020/8/13 15:09
 */
public class ThreadDemo3 extends Thread {
    private int ticket = 10;

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "剩余：" + (--ticket));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
class TestThreadDemo03{
    public static void main(String[] args) {
        Thread t1 = new ThreadDemo3();
        t1.setName("windows01");

        Thread t2 = new ThreadDemo3();
        t2.setName("windows02");

    }
}