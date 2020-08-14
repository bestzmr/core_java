package tech.aistar.day16.synchronizeds;

import java.util.concurrent.TimeUnit;

/**
 * 本类用来演示: synchronized来修饰代码块
 *
 * @author: success
 * @date: 2020/8/14 8:37 上午
 */
public class SynBlockDemo implements Runnable{

    private Object obj = new Object();

    @Override
    public void run() {
        add();
    }

    public void add(){
        //括号中放的是一个this[当前对象]
        synchronized (this){//不同的对象拥有不同的"对象锁"
            System.out.println(Thread.currentThread().getName()+":"+1);
            //嘚瑟一会.
            try {
                //睡一秒钟...
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+2);
        }
    }

    public void add2(){
        //括号中放的是当前类的Class实例
        synchronized (SynBlockDemo.class){//一个类无论被实例化多少次,它在JVM中的class实例永远1个.
                                         //当前类的所有的实例都是共享这把"类锁"
            System.out.println(Thread.currentThread().getName()+":"+1);
            //嘚瑟一会.
            try {
                //睡一秒钟...
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+2);
        }
    }


    public static void main(String[] args) {
        Runnable r = new SynBlockDemo();
        Thread s1 = new Thread(r);
        Thread s2 = new Thread(r);

        s1.start();

        s2.start();
    }
}
