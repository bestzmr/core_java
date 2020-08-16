package tech.aistar.day16.practice.callableDemo;

import java.util.concurrent.*;

/**
 * @author: Merlin
 * @time: 2020/8/16 8:42
 */
public class CallableDemo {

}
class C1 implements Callable<Integer>{
    public static void main(String[] args) {
        System.out.println("====main线程=======");

        ExecutorService executorService = Executors.newCachedThreadPool();

        Callable<Integer> c = new C1();
        FutureTask<Integer> task = new FutureTask<>(c);

        executorService.submit(task);
        try {
            Integer result = task.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();

        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
        System.out.println("=====main=====");

    }

    @Override
    public Integer call() throws Exception {
        System.out.println("====子线程执行=====");
        Integer sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        Thread.sleep(5000);
        System.out.println("====子线程结束======");
        return sum;
    }
}
