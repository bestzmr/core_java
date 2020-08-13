package tech.aistar.day16.thread;

import java.util.ArrayList;
import java.util.Vector;

/**
 * 本类用来演示: 线程安全和线程不安全
 * 线程安全 : StringBuffer     Vector     Hashtable
 *
 *
 * 线程不安全: StringBuilder  ArrayList   HashMap
 *
 * @author: success
 * @date: 2020/8/13 2:11 下午
 */
public class ThreadDemo02 extends Thread{

    //你的那些线程非安全的类是不能设置成静态的成员的变量.

    //public static ArrayList<Integer> list = new ArrayList<>();

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
        //1. 创建第一个线程
        ThreadDemo02 t1 = new ThreadDemo02();
        ThreadDemo02 t2 = new ThreadDemo02();

        t1.start();

        t2.start();
    }
}
