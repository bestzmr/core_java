package tech.aistar.day16.daemon;

/**
 * 本类用来演示: 守护线程
 *
 * 守护线程[备胎] - 后台守护线程 ->
 *
 * 什么时候进程运行结束? - 当后台只剩下后台守护线程在执行的时候,就可以认为进程可以结束了.
 *
 * 一个进程的结束,是不需要等待后台守护线程结束才退出.
 *
 * JVM进程启动 - Main线程以及GC线程[后台守护线程]
 * 当Main线程执行结束,JVM进程可以结束了.
 *
 * @author: success
 * @date: 2020/8/14 9:47 上午
 */
public class DaemonDemo {
    public static void main(String[] args) {
        Thread t1 = new NonDaemonDemo01();
        Thread t2 = new DaemonDemo02();
        t1.setName("数字线程");
        t2.setName("字母线程");

        t2.setDaemon(true);//把t2线程设置成后台守护线程

        t1.start();
        t2.start();
    }
}
//非守护线程
class NonDaemonDemo01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//守护线程
class DaemonDemo02 extends Thread{
    @Override
    public void run() {
        for (int i = 97; i <= 123; i++) {
            System.out.println((char)i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}