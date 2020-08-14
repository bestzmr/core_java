package tech.aistar.day16.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 本类用来演示:创建一个单线程化的线程池，
 * 它只会用唯一的工作线程来执行任务，
 * 保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
 *
 * @author: success
 * @date: 2020/8/14 3:58 下午
 */
public class SingleThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            executorService.submit(()->{
                System.out.println(Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }
}
