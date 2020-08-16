package tech.aistar.day16.practice.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Merlin
 * @time: 2020/8/16 9:24
 */
public class SingleThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {

                System.out.println(Thread.currentThread().getName());

            });
            executorService.shutdown();

        }
    }
}
