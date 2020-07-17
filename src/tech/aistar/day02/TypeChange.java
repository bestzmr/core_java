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

        //面试题
        short s1 = 100;

        //类型小的数据和类型大的数据在计算的时候,计算的结果是偏向类型大的一方

        //alt+enter
        s1 = (short) (s1 + 200);

        //无穷包含所有可能性.
        double dd = 3.64;

        int t = (int) dd;
        System.out.println(t);//3,直接截

        //3. 隐式转换
        //推荐定义long
        long time = 1203456L;//int+L = int->long
        //为什么???

        //场景...int类型在计算的过程中,并且这种计算尚未结束的时候
        //long a1 = 123*897*987998987654*456*983*5678L;//不是真实的应用场景

        //long a2 = 123L*897*987*456*983*5678;//真实的应用场景

        //3.14是double类型

        //float比较特殊的.
        float f = 3.14f;//why???? - 相当复杂.暂时先不说!!!

        float f1 = (float) 3.14;
        System.out.println(f1);

        //推荐定义double类型
        double price = 22.34d;//为了提高可读性.
        System.out.println("price:"+price);

        double d2 = 100;
        System.out.println(d2);//100.0

//        System.out.println(10/3);//取整 3
//
//        System.out.println(9.0/2);//4.5

    }
}
