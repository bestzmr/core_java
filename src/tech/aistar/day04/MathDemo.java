package tech.aistar.day04;

/**
 * 本类用来演示:java.lang.Math - 提供了大量的数学计算的方法.
 *
 * @author: success
 * @date: 2020/7/21 3:51 下午
 */
public class MathDemo {
    public static void main(String[] args) {
        //产生一个幸运数字

        //[0.0,1.0);
        double result = Math.random();
        System.out.println(result);

        // [1-100]之间的随机整数
        //[0.0,1.0)*100 = [0.0,100.0) + 1 -> [1.0,101.0) -> [1,101) -> [1,100]
        int n = (int) (Math.random()*100+1);
        System.out.println(n);

        //[m,n]
    }
}
