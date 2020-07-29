package tech.aistar.day08.relation.homework03;

import java.util.Date;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/29 9:00 上午
 */
public class SalariedEmployee extends Emp{
    private double baseSalary;//固定工资的

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, Date birthday, double baseSalary) {
        super(name, birthday);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary(int month) {
        return baseSalary + super.getSalary(month);
    }
}
