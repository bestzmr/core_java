package tech.aistar.day16.practice.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Merlin
 * @time: 2020/8/16 9:18
 */
public class CacheThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());

            });


        }
        executor.shutdown();
    }

}
