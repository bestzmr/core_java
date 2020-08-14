package tech.aistar.day16.myhomework;

import java.util.Arrays;
import java.util.Random;

/**
 * @author: Merlin
 * @time: 2020/8/14 19:43
 */
public class A {
    boolean flag;
    int count = 0;
    int[] num = new int[10];
    public synchronized void insert() {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        Random r = new Random();
        int n = r.nextInt(100);
        if (num.length == count) {
            num = Arrays.copyOf(num, num.length * 2);
        }
        System.out.println("插入元素为："+n);
        num[count++] = n;
        notify();
    }
    public synchronized int getNum() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (count == 0) {
            return count;
        }
        notify();
        return num[0];
    }
}

class T1 implements Runnable {
    A a;

    public T1(A a) {
        this.a = a;
    }
    @Override
    public void run() {
        a.insert();
    }
}
class T2 implements Runnable{
    A a;
    public T2(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        System.out.println("获取到的元素为："+a.getNum());
    }
}

class TestA {
    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread(new T1(a));
        Thread t2 = new Thread(new T2(a));

        t1.setName("t1");
        t1.setName("t2");
        t1.start();
        t2.start();

    }
}