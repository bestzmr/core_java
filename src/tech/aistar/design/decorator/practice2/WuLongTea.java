package tech.aistar.design.decorator.practice2;

/**
 * @author: Merlin
 * @time: 2020/8/18 8:21
 */
public class WuLongTea extends Batching {

    public WuLongTea(MilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public String getType() {
        return super.getType() + ":乌龙奶茶";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 20.0d;
    }
}
