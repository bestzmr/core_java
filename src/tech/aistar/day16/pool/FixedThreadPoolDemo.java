package tech.aistar.day16.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 本类用来演示:
 * 创建一个**可重用**固定个数的线程池，以共享的无界队列方式来运行这些线程。
 *
 * @author: success
 * @date: 2020/8/14 3:55 下午
 */
public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //始终只会重复使用3个线程.
        for (int i = 0; i < 3; i++) {
            //提交任务
            executorService.submit(()->{
                System.out.println(Thread.currentThread().getName());
            });
        }

        executorService.shutdown();
    }
}
