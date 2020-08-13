package tech.aistar.day16.synchronizeds;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/13 4:39 下午
 */
public class SynThreadMethod extends Thread{

    //修饰普通方法
    //代表 - 哪个线程要想执行同步代码,必须先得到"锁",在它释放"锁"之前,其他线程都是不允许进入的.

    //当synchronized用来修饰非静态方法的时候 - "对象锁".
    //只有是同一个对象,那么共享和竞争同一个"锁".

    //如果是不同的对象,争抢的"锁"就是不同的"锁"
    public synchronized void add(){
        System.out.println(Thread.currentThread().getName()+":"+1);

        try {
            //嘚瑟一下...
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+":"+2);
    }

    /**
     * 修改静态方法 - "类锁" - 只要是这个类衍生出来的任何对象.抢的都是同一把"锁".
     */
    public synchronized static void add2(){
        System.out.println(Thread.currentThread().getName()+":"+1);

        try {
            //嘚瑟一下...
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+":"+2);
    }



    @Override
    public void run() {
        //add();

        add2();
    }

    public static void main(String[] args) {
        Thread t1 = new SynThreadMethod();
        Thread t2 = new SynThreadMethod();
        Thread t3 = new SynThreadMethod();

        t1.start();

        t2.start();

        t3.start();
    }
}
