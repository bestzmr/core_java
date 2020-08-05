package tech.aistar.day12;

/**
 * 本类用来演示:Integer类型的使用
 *
 * @author: success
 * @date: 2020/8/5 9:35 上午
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //int -> Integer类型
        //构造
        Integer m1 = new Integer(10);
        Integer m2 = new Integer(10);

        // ==
        //1. 基本数据类型比较值
        //2. 对象类型比较内存地址
        System.out.println(m1 == m2);//false

        //利用一个数字形式的字符串来构建一个Integer对象

        //如果传入的不是一个数字形式的字符串,将会抛出一个异常
        //java.lang.NumberFormatException - 数字格式化失败异常
        Integer s1 = new Integer("10");
        //包装类型是允许进行参加计算的.

        //当包装类型在和基本类型进行计算的时候,底层是调用包装类型,s1.intValue();
        System.out.println(s1+10);//20

        //包装类型Integer -> int类型
        //调用的抽象的父类Number中提供的int intValue();
        int n = s1.intValue();
        System.out.println(n);//10

//        * 封箱 - 基本数据类型可以自动转换成包装类型
//                * 解箱 - 包装类型可以自动转换成基本数据类型

        Integer t = 10;// int -> Integer
        int m = t;//Integer -> int
        System.out.println(m);

        System.out.println("====华丽丽的分割线 - 各种比较==");



    }
}
