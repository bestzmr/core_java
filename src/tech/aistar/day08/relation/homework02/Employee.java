package tech.aistar.day08.relation.homework02;


/**
 * 本类用来演示: 业务类和实体类分开
 *
 * 编号,姓名,工资
 *
 * @author: success
 * @date: 2020/7/28 8:44 上午
 */
public class Employee {//员工类
    private int id;

    private String name;

    private double salary;

    //一个上司拥有多个下属
    private Employee[] emps;

    public Employee() {
    }

    public Employee(int id, String name, double salary, Employee[] emps) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.emps = emps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee[] getEmps() {
        return emps;
    }

    public void setEmps(Employee[] emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
