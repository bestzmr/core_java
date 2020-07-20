package tech.aistar.day03.modifier;

/**
 * 本类用来演示:调用Test01类中定义的方法
 *
 * 方法的定义者和方法的调用者进行了分离 - 不在同一个类中了.
 *
 * @author: success
 * @date: 2020/7/20 8:39 上午
 */
public class Test01Demo {
    //提供入口
    public static void main(String[] args) {
        //1. 创建对象 - 调用谁里面的方法,就去创建谁的对象.
        Test01 t = new Test01();

        t.test01();

        //t.test02();//error

        Test01.test03();
    }
}
