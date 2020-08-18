package tech.aistar.design.proxy.dynamic;

/**
 * 本类用来演示: 目标对象 - 完成核心的业务功能的类
 *
 * 代理模式的目的 - 都是为了拓展目标对象的功能,但是又不希望修改目标对象.
 *
 * 使用一种非侵入式的方式来实现功能的拓展 - spring框架体现出来的思想AOP[面向切面编程]思想.
 *
 * AOP - 古代打战非常绅士 - 打排抢
 *
 * 1. 10个人一组 + 1个指挥官
 * 2. 双方约定 - 不许打对面的指挥官.
 * 3. 双方把抢举起,数数123,同时放抢.放完一枪,退下,后面一排上来.
 *
 * 4. 生死 - 运气.
 *
 * 4-1. 巫婆-给每个士兵都要祷告祷告.  巫婆祷告的业务 - 非核心的业务.
 *
 * 4-2. 找了个门 - 巫婆对着门祷告,让士兵从门里面经过,计算被祷告过了
 *
 * @author: success
 * @date: 2020/8/18 2:08 下午
 */
public class UserDaoImpl implements IUserDao{
    @Override
    public void add() {
        System.out.println("add...");//核心功能
    }

    @Override
    public void test() {
        System.out.println("test...");//核心功能
    }
}
