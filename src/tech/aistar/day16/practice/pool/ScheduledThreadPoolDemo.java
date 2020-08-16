package tech.aistar.day16.practice.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author: Merlin
 * @time: 2020/8/16 9:22
 */
public class ScheduledThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(() -> {
            System.out.println(Thread.currentThread().getName());

        }, 5, 2, TimeUnit.SECONDS);
        executorService.shutdown();
    }
}
