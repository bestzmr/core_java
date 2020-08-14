package tech.aistar.day16.practice.advice;

/**
 * @author: Merlin
 * @time: 2020/8/14 12:10
 */
public class AdviceDemo {
    public static void main(String[] args) {
        Box box = new Box();
        Thread t1 = new Producer(box);
        Thread t2 = new Customer(box);

        t1.setName("p");
        t2.setName("c");
        t1.start();
        t2.start();
    }

}
class Box{
    private int content;
    private boolean flag;

    public synchronized void setContent(int content) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
        flag = true;
        this.content = content;
        notify();

    }
    public synchronized int getContent() {
        if (flag == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = false;
        notify();
        return content;
    }
}

class Producer extends Thread {
    private Box box;

    public Producer(Box box) {
        this.box = box;
    }
    private int i;

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
    private Box box ;

    public Customer(Box box) {
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
