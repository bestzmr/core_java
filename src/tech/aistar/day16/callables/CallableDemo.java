package tech.aistar.day16.callables;

import java.util.concurrent.*;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/14 4:28 下午
 */
public class CallableDemo {
}
class C1 implements Callable<Integer>{
    public static void main(String[] args) {
//        FutureTask是Future接口的实现类
//        Callable<Integer> c = new C1();
////        FutureTask<Integer> task = new FutureTask<>(c);
////
////        task.run();
////
////        try {
////            Integer result = task.get();//获取线程的执行的结果
////            System.out.println(result);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        } catch (ExecutionException e) {
////            e.printStackTrace();
////        }


        System.out.println("====main线程=====");

        //拓展一下 - 配合线程池使用
        ExecutorService executorService = Executors.newCachedThreadPool();

        Callable<Integer> c = new C1();
        FutureTask<Integer> task = new FutureTask<>(c);

        //提交任务...
        executorService.submit(task);

        try {
            //get() - 阻塞 - 同步获取请求
            //main线程是不会执行,等到你拿到结果之后,main线程才会继续执行.
            Integer result = task.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        //关闭
        executorService.shutdown();

        System.out.println("=====main=====");
    }

    /**
     * 使用Callable可以拿到线程执行的结果的.
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        System.out.println("===子线程执行===");
        Integer sum = 0;
        for (int i = 0; i < 10; i++) {
            sum+=i;
        }
        Thread.sleep(5000);
        System.out.println("===子线程结束===");
        return sum;
    }
}
