package tech.aistar.day10.myhomework2;

/**
 * @author: Merlin
 * @time: 2020/7/31 20:12
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Emp[] emps = new Emp[3];

        Boss boss = new Boss();
        HourEmp hourEmp = new HourEmp(100.0d);
        FullTimeEmp fullTimeEmp = new FullTimeEmp(0.7);
        emps[0] = boss;
        emps[1] = hourEmp;
        emps[2] = fullTimeEmp;
        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i].calcSalary());
        }
    }
}
