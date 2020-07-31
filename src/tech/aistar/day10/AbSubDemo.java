package tech.aistar.day10;

/**
 * 本类用来演示:子类继承抽象父类
 *
 * @author: success
 * @date: 2020/7/31 9:48 上午
 */
//当一个普通的类去继承一个抽象的父类的时候,那么在编译期间,
//        要求普通子类强制去重写父类中的所有的抽象方法.非抽象方法,子类可以选择性重写或者不重写.
public class AbSubDemo extends AbstractDemo{
    @Override
    public void test() {
        System.out.println("test...");
    }

    @Override
    public void sub() {
        System.out.println("sub...");
    }
}
//当一个抽象的子类去继承一个抽象的父类的时候,那么在编译期间,
//        抽象的子类可以选择性去重写父类中的所有的方法[包括抽象和非抽象].
abstract class AbSubDemo2 extends AbstractDemo{

   public abstract void testSub02();
}

class Sub02 extends AbSubDemo2{

    @Override
    public void testSub02() {

    }

    @Override
    public void test() {

    }

    @Override
    public void sub() {

    }
}
