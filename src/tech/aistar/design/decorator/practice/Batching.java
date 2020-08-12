package tech.aistar.design.decorator.practice;

/**
 * @author: Merlin
 * @time: 2020/8/12 14:57
 */
public abstract class Batching implements MilkTea {
    public Batching() {

    }
    private MilkTea milkTea;

    public Batching(MilkTea milkTea) {
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
