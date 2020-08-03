package tech.aistar.day10.homework.emp;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/3 9:18 上午
 */
public class Boss extends Emp{
    //拿固定薪资, 每月为50000元.
    private final double BASE_SALARY = 50000.0d;

    @Override
    public double calcSalary() {
        return BASE_SALARY;
    }
}
