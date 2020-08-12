package tech.aistar.design.decorator;

/**
 * 本类用来演示: 配料的顶级的抽象类
 *
 * @author: success
 * @date: 2020/8/12 2:27 下午
 */
public abstract class Batching implements MilkTea{

    private MilkTea milkTea;//"依赖倒置原则"

    public Batching() {
    }

    public Batching(MilkTea milkTea){//面向接口编程
        this.milkTea = milkTea;
    }

    @Override
    public double getPrice() {
        return milkTea.getPrice();
    }

    @Override
    public String getType() {
        return milkTea.getType();
    }
}
