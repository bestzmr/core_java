package tech.aistar.day06;

import java.util.Random;

/**
 * 本类用来演示:java中随机数
 *
 * @author: success
 * @date: 2020/7/24 9:54 上午
 */
public class RandomDemo {
    public static void main(String[] args) {
        //1. 导包
        //2. 创建Random对象 - API - 构造方法
        Random r = new Random();
        //通过对象.方法.
        int result = r.nextInt(3)+3;//返回的[3-5]之间随机整数
        System.out.println(result);


        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextDouble());
        }

        System.out.println("====种子构造===");

        //利用一个随机种子来构建一个Random对象
        Random r2 = new Random(11L);

        for (int i = 0; i < 10; i++) {
            System.out.println(r2.nextDouble());
        }

    }
}
