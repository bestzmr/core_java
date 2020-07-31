package tech.aistar.day10.inter.relation;

/**
 * 本类用来演示: 接口是支持多重继承
 *
 * 一个接口可以拥有多个直接的父接口
 *
 * @author: success
 * @date: 2020/7/31 2:23 下午IB
 */
public interface IC extends IA,IB{
    //子接口中也是可以拓展新的功能的
    void update();
}
