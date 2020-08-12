package tech.aistar.design.decorator.practice;

/**
 * @author: Merlin
 * @time: 2020/8/12 15:04
 */
public class TestMilk {
    public static void main(String[] args) {
        MilkTea milkTea = new BudingTea(new NaiTea());
        System.out.println(milkTea.getType()+"->"+milkTea.getPrice());
    }

}
