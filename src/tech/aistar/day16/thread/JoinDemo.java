package tech.aistar.day16.thread;

/**
 * 本类用来演示: join方法
 *
 * @author: success
 * @date: 2020/8/13 2:51 下午
 */
public class JoinDemo {
    public static void main(String[] args) {
        Thread father = new FatherThread();
        father.start();
    }
}

//父亲线程
class FatherThread extends Thread{
    @Override
    public void run() {
        //完成的就是父亲线程需要完成的工作
        System.out.println("BaBa正在烧饭...");
        System.out.println("发现酱油没有了...");

        //创建了儿子线程对象
        Thread son = new SonThread();
        try {
            son.start();//启动儿子线程
            son.join();//调用儿子线程join方法
            //在一个线程父亲执行的时候,调用了另外一个线程儿子的join方法,导致
            //父亲线程进入阻塞等待状态,直到儿子线程执行结束,那么父亲线程才会继续执行.

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("BaBa继续做饭~~~");
    }
}

//熊孩子线程
class SonThread extends Thread{
    @Override
    public void run() {
        //熊孩子需要完成的工作

        for (int i = 5; i >=1 ; i--) {
            System.out.println("熊孩子出去打酱油了,还有"+i+"分钟回来了~");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("熊孩子酱油打回来了!!!");
        }

    }
}