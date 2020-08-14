package tech.aistar.day16.myhomework;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: Merlin
 * @time: 2020/8/14 19:28
 */
public class CalManyNums {

    public static void main(String[] args) {
        int[] array = new int[100000000];
        AtomicLong result1= new AtomicLong();
        AtomicLong result2= new AtomicLong();
        AtomicLong result3= new AtomicLong();
        AtomicLong result4= new AtomicLong();

        long result = 0;
        Thread t1 = new Thread(()->{
            for (int i = 1; i <= array.length/4; i++) {
                result1.addAndGet(i);
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = (array.length/4)+1; i <= array.length/2; i++) {
                result2.addAndGet(i);
            }
        });
        Thread t3 = new Thread(()->{
            for (int i = (array.length/2)+1; i <= (array.length/4)*3; i++) {
                result3.addAndGet(i);
            }
        });
        Thread t4 = new Thread(()->{
            for (int i = (array.length/4)*3+1; i <= array.length; i++) {
                result4.addAndGet(i);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        result = result1.longValue() + result2.longValue() + result3.longValue() + result4.longValue();
        System.out.println(result);
    }
}
