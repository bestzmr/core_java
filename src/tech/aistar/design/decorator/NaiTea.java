package tech.aistar.design.decorator;

/**
 * 本类用来演示: 核心的类 - 原味奶茶
 *
 * @author: success
 * @date: 2020/8/12 2:23 下午
 */
public class NaiTea implements MilkTea{
    @Override
    public double getPrice() {
        return 10.0d;
    }

    @Override
    public String getType() {
        return "原味奶茶";
    }
}
