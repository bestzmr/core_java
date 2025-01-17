package tech.aistar.day16.advice;

/**
 * 本类用来演示:线程之间的通信 - 生产者和消费者
 *
 * 不共享代码,但是希望共享资源.
 *
 * @author: success
 * @date: 2020/8/14 11:08 上午
 */
public class AdviceDemo {
    public static void main(String[] args) {
        Box box = new Box();

        Thread t1 = new Product(box);

        Thread t2 = new Customer(box);
        t1.setName("p");
        t2.setName("c");

        t1.start();
        t2.start();
    }

}
//临界资源
class Box{
    private int content;//盘子里的鸡大腿,数字.

    //核心的代码
    private boolean flag;//如果box中有i[设置了值],flag=true,没有生产东西,flag=false;

    //线程通信的方法wait以及notify或者notifyAll方法的使用一定是出现线程同步代码中.
    //生产者调用的.
    public synchronized void setContent(int content) {
        if(flag){//flag=true,盘中中东西,就不要继续生成,自己会叫醒消费者的线程,然后自己会
            //进入阻塞状态...
            try {
                wait();//当前线程就会进入到阻塞状态.必须是通过其他线程调用notify或者notifyAll
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //flag = false,生产的东西全部被消费了.
        //生产者要正常生产...
        flag = true;
        this.content = content;
        //通知消费者来消费
        notify();//随机唤醒等待队列上的阻塞的线程,1个
    }

    public synchronized int getContent() {
        if(flag == false){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //当消费完毕
        flag = false;

        //唤醒一下生产者线程
        notify();

        return content;
    }
}

//生产者线程
class Product extends Thread{
    private Box box;

    public Product(Box box){
        this.box = box;
    }

    private int i;

    @Override
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName()+"->"+(++i));
            box.setContent(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//消费者线程
class Customer extends Thread{
    private Box box;

    public Customer(Box box){
        this.box = box;
    }
    @Override
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName()+"->"+box.getContent());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
