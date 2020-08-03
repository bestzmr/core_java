package tech.aistar.day10.homework.emp;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/3 9:34 上午
 */
public class TestEmp {
    public static void main(String[] args) {
        Emp e1 = new Boss();
        System.out.println(e1.calcSalary());

        Emp e2 = new HourEmp(10);
        System.out.println(e2.calcSalary());

        Emp e3 = new FullTimeEmp(1.8);
        System.out.println(e3.calcSalary());

    }
}
