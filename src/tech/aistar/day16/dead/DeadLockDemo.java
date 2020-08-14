package tech.aistar.day16.dead;

/**
 * 本类用来演示: 死锁
 *
 * @author: success
 * @date: 2020/8/14 10:41 上午
 */
public class DeadLockDemo {
    //静态域更加容易出现死锁. - 死锁 - 争抢的是"临界资源".
    public static Object oo1 = new Object();
    public static Object oo2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new T1();
        Thread t2 = new T2();

        t1.start();
        t2.start();
    }
}
class T1 extends Thread{
    private DeadLockDemo lock = new DeadLockDemo();
    @Override
    public void run() {
        synchronized (lock.oo1){
            System.out.println("====1=====");

            //是为了让第二个线程有足够时间去争抢oo2.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock.oo2){
                System.out.println("======2=====");
            }
        }
    }
}

class T2 extends Thread{
    private DeadLockDemo lock = new DeadLockDemo();
    @Override
    public void run() {
        synchronized (lock.oo2){
            System.out.println("====3=====");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock.oo1){
                System.out.println("======4=====");
            }
        }
    }
}
