package tech.aistar.day08.relation.extend;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/28 2:36 下午
 */
public class TestDog {
    public static void main(String[] args) {
        //创建一个Dog对象
        //先有对象,再有构造方法.

//        Animal空参构造被调用了...
//        Dog()空参构造被调用了...
        Dog dog = new Dog();

        //设置独有的属性
        dog.setLoyalty(100.0d);

        //子类可以使用父类中已经提供好的非私有的成员.
        dog.setName("哮天犬");
        dog.setAge(7);

        //子类可以调用父类中提供好的非私有的方法
        dog.sleeping();

        //子类可以调用自己独有的方法
        dog.watchDoor();
    }
}
