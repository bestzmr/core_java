package tech.aistar.day16.practice.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: Merlin
 * @time: 2020/8/16 9:21
 */
public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.submit(() ->{
                executorService.submit(() ->{
                    System.out.println(Thread.currentThread().getName());

                });
            });
        }
        executorService.shutdown();
    }
}
