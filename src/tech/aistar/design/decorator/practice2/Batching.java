package tech.aistar.design.decorator.practice2;



/**
 * @author: Merlin
 * @time: 2020/8/18 8:14
 */
public class Batching implements MilkTea {
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
