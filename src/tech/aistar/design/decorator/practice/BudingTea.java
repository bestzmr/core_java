package tech.aistar.design.decorator.practice;

/**
 * @author: Merlin
 * @time: 2020/8/12 14:59
 */
public class BudingTea extends Batching{

    public BudingTea(MilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public String getType() {
        return super.getType()+"：布丁";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10.0d;
    }
}
