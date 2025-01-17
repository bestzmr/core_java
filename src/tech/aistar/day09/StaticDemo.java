package tech.aistar.day09;

/**
 * ***JVM内存模型 - 栈,堆,方法区.***
 *
 * JVM加载类进内存的活动过程.
 *
 * * JVM加载需要的类进内存.
 * * 立即会给静态属性分配空间以及初始化[赋值]
 * * 接着,会给静态方法分配空间以及初始化.
 * * 调用静态代码块
 * * 每次只要遇到了创建对象的语法
 *   * 会给所有的非静态属性分配空间以及初始化
 *   * 接着,会给所有的非静态方法分配空间以及初始化
 *   * 调用普通代码块
 *   * 调用构造块
 *
 * @author: success
 * @date: 2020/7/30 8:45 上午
 */
public class StaticDemo {
    //定义一个静态变量
    private static int sid = 100;

    //非静态属性
    private int id = 100;

    //定义一个静态代码块
    static{
        //静态方法>静态代码块
        test91();
        //静态属性的分配空间和初始化时机>静态代码块
        System.out.println("sid:"+sid);
        System.out.println("我是一个静态代码块,我只会执行一次!]");
    }

    public static void test91(){
        //静态属性 > 静态方法
        System.out.println("[静态方法sid->"+sid);
    }

    public StaticDemo(){
        //每次创建对象的时候,都会执行一次.
        System.out.println("我是一个构造块");
    }

    {
        test();//非静态方法>普通代码块的
        //每次创建对象,都会执行..
        //编程中不推荐使用普通代码块
        //编程中,才会选择将普通代码块中的程序移植到了构造块中....
        System.out.println("我是一个普通代码块-id"+id);
    }

    //普通方法
    public void test(){
        //非静态属性 > 非静态方法
        System.out.println("test...:id-"+id);
    }

    //静态方法 - JVM调用的
    public static void main(String[] args) {
        //System.out.println(sid);
        StaticDemo staticDemo1 = new StaticDemo();

        //无论创建多少次对象,静态代码块中的程序仍然只会执行一次.
        StaticDemo staticDemo2 = new StaticDemo();
    }
}
