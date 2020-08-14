package tech.aistar.day16.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: Merlin
 * @time: 2020/8/14 15:29
 */
public class PandC {
    public static void main(String[] args) {
        Box box = new Box();
        Thread producer = new Producer(box);
        Thread customer = new Customer(box);
        producer.setName("producer");
        customer.setName("customer");
        producer.start();
        customer.start();
    }
}

class Producer extends Thread {
    Box box;
    private int i;

    Producer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "->" + (++i));
            box.setContent(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Customer extends Thread {
    Box box;
    private int i;

    Customer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "->" + box.getContent());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}

class Box {
    boolean flag;//判断box中是否有东西，flag=true表示有，false表示没有
    Lock lock = new ReentrantLock();
    Condition c1 = lock.newCondition();//阻塞队列1
    Condition c2 = lock.newCondition();//阻塞队列2
    private int content;



    public void setContent(int content) {
        lock.lock();
        try {
            if (flag) {
                c2.await();
            }
            this.content = content;
            flag = true;
            c1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }

    public int getContent() {
        lock.lock();
        try {
            if (!flag) {
                c1.await();
            }
            flag = false;
            c2.signal();
            return content;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return content;
    }
}