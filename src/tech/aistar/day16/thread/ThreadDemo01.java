package tech.aistar.day16.thread;

/**
 * 本类用来演示: 实现线程的一种方式 - 写一个类去继承java.lang.Thread
 *
 * @author: success
 * @date: 2020/8/13 1:54 下午
 */
public class ThreadDemo01 extends Thread{

    /**
     * run方式是由JVM去调用,一旦JVM成功调用了run方法.
     * 那么我们的线程就会由就绪态->运行态(running)
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //获取当前正在执行的线程的名称
            //Thread.currentThread() - 返回当前正在运行的线程的引用.
            String name = Thread.currentThread().getName();
            System.out.println(name+"->"+i);

//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
class TestThreadDemo01{
    public static void main(String[] args) {
        //1. 创建第一个线程对象

        //第一个线程进入瞬态
        Thread t1 = new ThreadDemo01();
        Thread t2 = new ThreadDemo01();
        //设置线程的一些属性,必须是在启动线程之前去设置
        //常用的方法 - 设置线程的名称
        //如果没有设置线程的名称,那么系统会默认分配一个名称给线程用.
        t1.setName("线程one");
        t2.setName("线程two");

        //设置线程的优先级别1~10
        //数字越大,优先级越高
        //并不是优先级越高,就一定会优先执行,只是尽可能提高先执行的概率.
        t1.setPriority(Thread.MIN_PRIORITY);

        t2.setPriority(Thread.MAX_PRIORITY);

        //启动线程 - 千万不要去调用run方法,而是调用start()方法
        //当从瞬态调用start方法之后,那么线程就会进入就绪态.
        //因为只有jvm才有资格去启动线程t1.

        //笔试 - start方法和run方法有什么区别?
        //请问程序启动线程调用的是start

        //注意:并不是先调用哪个线程的start方法,就一定会先启动哪个线程.
        t1.start();

        t2.start();

        //处于main线程里面
        System.out.println("--stop--");
    }
}
