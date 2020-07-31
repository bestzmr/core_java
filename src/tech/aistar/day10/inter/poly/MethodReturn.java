package tech.aistar.day10.inter.poly;

import tech.aistar.day10.inter.relation.Cimpl;
import tech.aistar.day10.inter.relation.IC;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/31 2:54 下午
 */
public class MethodReturn {
    //方法的返回类型写成接口,方法的返回值可以写成接口的是实现类.
    public static IC test(){
        return new Cimpl();
    }
}
