package tech.aistar.design.decorator.practice;

/**
 * @author: Merlin
 * @time: 2020/8/12 15:02
 */
public class WuLongTea extends Batching{

    public WuLongTea(MilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+10.0d;
    }

    @Override
    public String getType() {
        return super.getType()+":乌龙";
    }
}
