package tech.aistar.day16.thread;

/**
 * 本类用来演示:
 * 本类用来演示:volatile关键字
 *  *
 *  * 没有它的时候 - JVM底层进行指令优化重排操作
 *  *
 *  * 正常的步骤:
 *  * 1. 申请空间
 *  * 2. 初始化
 *  * 3. 内存地址赋值给引用
 *  *
 *  * 重排之后的指令
 *  * 1 - 3 - 2
 *
 * @author: success
 * @date: 2020/8/13 3:42 下午
 */
public class VolatileDemo {
    //volatile - 具备可见性.
    private volatile int x = 0;
    //private int x = 0;

    //写
    private void writeX(){
        x = 5;//具备原子性.
    }

    //读
    private void readX(){
        while(x!=5){
            //输出语句之后完毕之后,底层会涉及到锁资源释放的操作
            //读线程就会强制从主存中重新获取x
            //System.out.println();
        }

        if(x == 5){
            System.out.println("---stopped---");
        }
    }

    public static void main(String[] args) {
        VolatileDemo v = new VolatileDemo();

        //创建俩个线程
        Thread t1 = new Thread(()->v.writeX());

        Thread t2 = new Thread(()->v.readX());

        //1. 先写再读 - > 写 x=5 [本地缓存]

        //2. 切换读的线程,切换线程的动作,把第一个线程的x=5回写到主存中.

        //读线程自然可以读到的.

        //先读...
        t2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //后写...

        t1.start();
    }
}
