package tech.aistar.day12;

import java.math.BigDecimal;

/**
 * 本类用来演示:可以使用BigDecimal对象来处理小数运行的时候精度丢失的问题
 *
 * @author: success
 * @date: 2020/8/5 2:21 下午
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        double d = 0.1d;

        //double -> String
        String first = String.valueOf(d);

        //String -> double

        BigDecimal b1 = new BigDecimal(first);
        BigDecimal b2 = new BigDecimal("0.2");
        System.out.println(b1.add(b2));

        System.out.println(0.1 + 0.2);
    }
}
