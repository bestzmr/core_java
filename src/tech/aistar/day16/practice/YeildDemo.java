package tech.aistar.day16.practice;

/**
 * @author: Merlin
 * @time: 2020/8/16 9:38
 */
public class YeildDemo {
    public static void main(String[] args) {

    }

}

class T1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            if (i == 3) {
                Thread.yield();

            }
        }
    }
}