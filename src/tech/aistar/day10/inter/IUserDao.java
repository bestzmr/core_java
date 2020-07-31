package tech.aistar.day10.inter;

/**
 * 本类用来演示:接口 - 制定业务功能,不要求有具体的实现.
 *
 * 作用 - 告诉程序员需要完成哪些事情!
 *
 * @author: success
 * @date: 2020/7/31 2:08 下午
 */
public interface IUserDao {
    //定义普通方法 - 在JDK8.0以后可以使用default关键字来定义一个普通方法
    //由于在接口中,所有的方法默认都是使用public来进行修饰的,所以public可以省略不写.
//    public default void add(){
//        System.out.println("add..");
//    }

    //不推荐定义
    default void add(){
        System.out.println("add..");
    }

    //接口中是可以定义抽象方法的
    //public abstract void delete();//没有方法体的方法

    //可以简写
    void delete();

    void update();

    //接口中可以定义公开的静态的常量属性
    //public static final int CAT = 1;

    //可以简写 - 后期将会全部移植到枚举类型中.
    int CZT = 1;

}
