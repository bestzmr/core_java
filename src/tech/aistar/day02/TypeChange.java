package tech.aistar.day02;

/**
 * 本类用来演示:
 * 数据类型的转换
 *
 * @author: success
 * @date: 2020/7/17 10:15 上午
 */
public class TypeChange {
    public static void main(String[] args) {
        //自动类型转换
        //byte->short->int->long
        //byte->short
        byte b = 100;

        //可以使用short类型的变量来存储byte类型的变量中的值.
        short s = b;

        //int->double
        int n = 123456789;
        double d = n;
        System.out.println(d);//1.23456789E8

        //why? - char
        //char->int
        int c = 'A';
        System.out.println(c);//65

        //2. 强制类型转换
//        大的数据类型 变量max = 初始值;

//        小的数据类型 变量min = (小的是类型)变量max;


        int m = 100;
        byte b2 = (byte)m;
        System.out.println("b2:"+b2);//100

        //java中看到一个整数,默认的就是int类型
        byte b1 = 100;
    }
}
