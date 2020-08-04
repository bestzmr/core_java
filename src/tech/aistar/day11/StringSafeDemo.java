package tech.aistar.day11;

/**
 * 本类用来演示:体验多线程安全和不安全
 *
 * @author: success
 * @date: 2020/8/4 11:01 上午
 */
public class StringSafeDemo {
    public static void main(String[] args) throws InterruptedException {
        //当启动JVM的时候,JVM是一个进程.
        //当启动JVM进程的时候,后台会启动俩个线程
        //一个是主线程main线程 - 用来执行main方法的
        //另外一个是后台守护线程 - GC线程,负责回收垃圾对象.

        //创建一个StringBuffer对象
        //多线程安全的...
        //StringBuilder buffer = new StringBuilder();//9992465

         StringBuffer buffer = new StringBuffer();

        //开启10个线程...
        for (int i = 0; i < 10000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++){
                       // System.out.println("===");
                        buffer.append("a");
                    }
                }
            }).start();
        }

        Thread.sleep(100L);

        System.out.println(buffer.length());// 10000000

    }
}
