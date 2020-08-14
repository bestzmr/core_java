package tech.aistar.day16.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Merlin
 * @time: 2020/8/14 15:29
 */
public class PandC {

}

class Producer extends Thread {
    Box box;
    Producer(Box box) {
        this.box = box;
    }
    @Override
    public void run() {

        box.getContent();

    }
}

class Customer extends Thread {
    Box box;

    Customer(Box box) {
        this.box = box;
    }
    @Override
    public void run() {
        while (true) {
            box.setContent(1);
        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }
}
class Box{
    private int content;
    boolean flag;
    Lock lock = new ReentrantLock();
    Condition c1 = lock.newCondition();
    Condition c2 = lock.newCondition();
    public int getContent() {
        if (flag) {
            try {
                c1.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lock.lock();
        flag = true;
        c2.signal();
        lock.unlock();
        return content;
    }

    public void setContent(int content) {
        if (flag) {
            try {
                c2.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        lock.lock();
        this.content = content;
        flag = false;
        lock.unlock();
        c2.signal();
    }
}