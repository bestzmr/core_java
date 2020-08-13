package tech.aistar.day16.practice;

/**
 * @author: Merlin
 * @time: 2020/8/13 15:57
 */
public class PlusPlusDemo implements Runnable{
    public int i = 0;
    public static void main(String[] args) {
        PlusPlusDemo p = new PlusPlusDemo();
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        t1.start();
        t2.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(p.i);
    }

    @Override
    public void run() {
        for (int j = 0; j < 100000; j++) {
            add();
        }
    }
    private void add() {
        i++;
    }
}
