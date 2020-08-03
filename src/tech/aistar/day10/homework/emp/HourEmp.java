package tech.aistar.day10.homework.emp;

/**
 * 本类用来演示: 周六周日 - 1个小时200元.
 *
 * 小时工类(HourEmp), 按每小时15元收费,
 * 每月工资为当月的工作小时数*每小时费用.
 *
 * @author: success
 * @date: 2020/8/3 9:20 上午
 */
public class HourEmp extends Emp{

    private final double SALARY_OF_HOUR = 15;

    private double hours;

    public HourEmp() {
    }

    public HourEmp(double hours) {
        this.hours = hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double calcSalary() {
        return hours * SALARY_OF_HOUR;
    }
}
