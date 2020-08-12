package tech.aistar.design.decorator;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/12 2:34 下午
 */
public class WuLongTea extends Batching{

    public WuLongTea(MilkTea milkTea){
        super(milkTea);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+20.0d;
    }

    @Override
    public String getType() {
        return super.getType()+":乌龙品种";
    }
}
