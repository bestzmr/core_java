package tech.aistar.day10.myhomework2;

/**
 * @author: Merlin
 * @time: 2020/7/31 20:12
 */
public class FullTimeEmp extends Emp{
    private double basicSalary = 3000.0d;
    private double rate = 0.1;
    private double multiple = 1.0d;
    public FullTimeEmp(double excessFinshedRate) {//超额完成任务率
        if (excessFinshedRate > 0.8) {
            multiple = 3.0d;
        } else if (excessFinshedRate > 0.5) {
            multiple = 2.0d;
        } else if (excessFinshedRate > 0.3) {
            multiple = 1.5d;
        }
    }

    @Override
    public double calcSalary() {
        return basicSalary+(1.0d+0.1d)*3000.0d*multiple;
    }
}
