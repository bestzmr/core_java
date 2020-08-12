package tech.aistar.design.decorator.practice;

/**
 * @author: Merlin
 * @time: 2020/8/12 15:01
 */
public class NaiTea implements MilkTea {


    @Override
    public double getPrice() {
        return 10.0d;
    }

    @Override
    public String getType() {
        return "原味奶茶";
    }
}
