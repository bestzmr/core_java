package tech.aistar.design.singleton.singleton01;

/**
 * 本类用来演示: 单例模式 - 饿汉模式
 *
 * 目的:保证在整个应用程序中,某个类的具体的实例永远只有一个.
 *
 * @author: success
 * @date: 2020/7/30 1:59 下午
 */
public class Singleton01Demo {//重量级对象
    //2. 提供一个该类的唯一实例
    private static Singleton01Demo instance = new Singleton01Demo();

    //1.私有化构造 - 不让外界去new
    private Singleton01Demo(){
        System.out.println("构造...");//进行初始化工作的.
    }

    //3.提供一个公开的方法,来返回这个类的唯一实例instance
    public static Singleton01Demo getInstance(){
        return instance;
    }
}
class TestSingleTon01Demo{
    public static void main(String[] args) {
        //只有第一次加载Singleton01Demo类的时候,才会实例化.
        Singleton01Demo s1 = Singleton01Demo.getInstance();

        //后面无论调用多少次getInstance方法,只是在获取之前创建好的实例.
        Singleton01Demo s2 = Singleton01Demo.getInstance();
        System.out.println(s1 == s2);
    }
}
