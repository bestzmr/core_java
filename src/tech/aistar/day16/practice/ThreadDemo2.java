package tech.aistar.day16.practice;

import tech.aistar.day16.thread.ThreadDemo02;

import java.util.Vector;

/**
 * @author: Merlin
 * @time: 2020/8/13 15:06
 */
public class ThreadDemo2 extends Thread {
    public static Vector<Integer> list = new Vector<>();

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        System.out.println(list.size());
    }


}
class ThreadDemo02Test{
    public static void main(String[] args) {
        ThreadDemo02 t1 = new ThreadDemo02();
        ThreadDemo02 t2 = new ThreadDemo02();
        t1.start();
        t2.start();

    }
}