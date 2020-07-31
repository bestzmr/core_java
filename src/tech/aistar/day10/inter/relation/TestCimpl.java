package tech.aistar.day10.inter.relation;

import tech.aistar.day10.inter.IUserDao;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/31 2:28 下午
 */
public class TestCimpl {
    public static void main(String[] args) {
        //接口是不能够被实例化的
        //多态的特征 - 对象的编译时类型写成接口,对象的运行时类型写成这个接口的任何一个实现类对象
        IC ic = new Cimpl();
        ic.find();

        //调用普通方法...
        ic.a();


    }
}
