package tech.aistar.day16;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/13 8:47 下午
 */
public class LockDemo01 {
    private Lock lock = new ReentrantLock();

    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    private int count = 1;

    public void printUpper(){
        try {
            lock.lock();

            if(count!=1){

                c1.await();
            }
            System.out.println("ABC");
            count = 2;
            c2.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void printLower(){
        try {
            lock.lock();

            if(count!=2){

                c2.await();
            }
            System.out.println("abc");
            count = 3;
            c3.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void printNum(){
        try {
            lock.lock();

            if(count!=3){

                c3.await();
            }
            System.out.println("123");
            count = 1;
            c1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockDemo01 demo01 = new LockDemo01();
        Thread t1 = new Thread(()->{
            for (int i=0;i<20;i++){
                demo01.printUpper();
            }
        });

        Thread t2 = new Thread(()->{
            for (int i=0;i<20;i++){
                demo01.printLower();
            }
        });

        Thread t3 = new Thread(()->{
            for (int i=0;i<20;i++){
                demo01.printNum();
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
