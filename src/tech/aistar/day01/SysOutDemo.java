package tech.aistar.day01;

import java.io.PrintStream;

/**
 * 拓展 - 不要深究...
 * 本类用来演示:补充知识点
 *
 * @author: success
 * @date: 2020/7/16 7:44 下午
 */
public class SysOutDemo {
    public static void main(String[] args) {
        //sout

        //System内置的类 - 所在的包java.lang - jdk里面的核心的包
        //println();//输出方法

        //等第三个工作日 - 方法的定义和使用的时候.

        //暂时
        System.out.println(30);

        //分解的
        //当我们使用System.out的时候,实际上是得到一个PrintStream对象\

        //outs实际上就是打印流对象
        PrintStream outs = System.out;//ok

        //通过打印流来调用println()方法
        outs.println(30);

        //关于输出
        //+只要""(字符串)代表拼接
        System.out.println(10+20+""+50+10);//305010
    }
}
