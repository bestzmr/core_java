package tech.aistar.design.decorator.practice2;

/**
 * @author: Merlin
 * @time: 2020/8/18 8:17
 */
public class NaiTea implements  MilkTea {


    @Override
    public double getPrice() {
        return 10.00d;
    }

    @Override
    public String getType() {
        return "原味奶茶";
    }
}
