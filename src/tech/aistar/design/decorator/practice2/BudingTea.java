package tech.aistar.design.decorator.practice2;

/**
 * @author: Merlin
 * @time: 2020/8/18 8:18
 */
public class BudingTea extends Batching {
    public BudingTea(MilkTea milkTea) {
        super(milkTea);
    }

    @Override
    public double getPrice() {
            return super.getPrice()+10.0d;
    }


    @Override
    public String getType() {
        return super.getType() + ":布丁奶茶";
    }

}
