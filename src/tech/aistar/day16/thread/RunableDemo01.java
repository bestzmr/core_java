package tech.aistar.day16.thread;

/**
 * 本类用来演示: 实现线程的第二种方式
 *
 * 共享代码,共享资源
 *
 * @author: success
 * @date: 2020/8/13 2:30 下午
 */
public class RunableDemo01 implements Runnable{

    //定义一个变量 - 保存票的数量
    private int ticket = 10;

    @Override
    public void run() {
        for (int i = 10; i >0 ; i--) {
            if(ticket>0) {
                System.out.println(Thread.currentThread().getName() + "->剩余:" + (--ticket));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class TestRunableDemo01{
    public static void main(String[] args) {
        //Tread(Runable r);
        Runnable r = new RunableDemo01();

        //1. 创建第一个线程对象
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.setName("窗口01");
        t2.setName("窗口02");

        t1.start();

        t2.start();
    }
}
