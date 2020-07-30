package tech.aistar.design.singleton.singleton06;

/**
 * 本类用来演示: 登记式/静态内部类.
 *
 * 加载外部类,但是没有使用到静态内部类的时候,静态内部类是不会被加载 - 懒
 *
 * 多线程安全
 *
 * @author: success
 * @date: 2020/7/30 4:30 下午
 */
public class Singleton06 {

    //私有化构造
    private Singleton06(){
        System.out.println("构造..");
    }

    //静态内部类
    public static class SingletonHelper{

        private static Singleton06 instance = new Singleton06();
    }

    public static Singleton06 getInstance(){
        return SingletonHelper.instance;
    }
}
