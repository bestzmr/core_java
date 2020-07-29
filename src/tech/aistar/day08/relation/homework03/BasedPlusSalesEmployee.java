package tech.aistar.day08.relation.homework03;

import java.util.Date;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/29 9:14 上午
 */
public class BasedPlusSalesEmployee extends SalesEmployee{
    private double baseSalary;

    public BasedPlusSalesEmployee() {
    }

    public BasedPlusSalesEmployee(String name, Date birthday, double sales, double rank, double baseSalary) {
        super(name, birthday, sales, rank);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month) + baseSalary;
    }
}
