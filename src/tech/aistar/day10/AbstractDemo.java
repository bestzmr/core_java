package tech.aistar.day10;

/**
 * 本类用来演示:抽象类
 *
 * @author: success
 * @date: 2020/7/31 9:40 上午
 */
public abstract class AbstractDemo {//抽象类天生就是用来被子类继承
    //普通属性
    private String name;

    //普通方法
    public void add(){
        System.out.println("add...");
    }

    //抽象方法 - 天生就是用来被子类重写
    public abstract void test();

    public abstract void sub();
}
class TestAbstractDemo{
    public static void main(String[] args) {
        //1. 抽象类不能够被实例化
        //AbstractDemo demo = new AbstractDemo();
    }
}
