package tech.aistar.day16;

/**
 * 本类用来演示:线程之间的礼让
 *
 * @author: success
 * @date: 2020/8/14 4:42 下午
 */
public class YeildDemo {
    public static void main(String[] args) {
        Thread t1 = new T1();
        Thread t2 = new T1();

        t1.start();

        t2.start();
    }
}
class T1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);

            //t1线程先执行,运行到此处,会礼让给t2线程之间.
            if(i==3) {
                Thread.yield();
            }
        }
    }
}
