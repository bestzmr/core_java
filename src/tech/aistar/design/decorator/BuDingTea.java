package tech.aistar.design.decorator;

/**
 * 本类用来演示: 各个配料的子类
 *
 * @author: success
 * @date: 2020/8/12 2:31 下午
 */
public class BuDingTea extends Batching{

    public BuDingTea(MilkTea milkTea){
        super(milkTea);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+10.0d;
    }

    @Override
    public String getType() {
        return super.getType()+":布丁品种";
    }
}
