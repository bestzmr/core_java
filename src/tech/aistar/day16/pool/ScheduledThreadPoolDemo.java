package tech.aistar.day16.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 本类用来演示:创建一个定长线程池，支持定时及周期性任务执行
 *
 * @author: success
 * @date: 2020/8/14 4:00 下午
 */
public class ScheduledThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        /**
         *     public ScheduledFuture<?> scheduleAtFixedRate(Runnable command,
         *                                                   long initialDelay(延时),
         *                                                   long period(周期),
         *                                                   TimeUnit unit);
         */

        executorService.scheduleAtFixedRate(() -> {
            System.out.println(Thread.currentThread().getName());
        }, 5, 2, TimeUnit.SECONDS);


        executorService.shutdown();
    }
}
