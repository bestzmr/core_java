package tech.aistar.day16.practice;

/**
 * @author: Merlin
 * @time: 2020/8/13 14:44
 */
public class RunnableDemo01 implements Runnable {
    private int ticket = 10;
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class TestRunnableDemo01 {
    public static void main(String[] args) {
        Runnable r = new RunnableDemo01();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.setName("窗口01");
        t2.setName("窗口02");

        t1.start();
        t2.start();
    }
}