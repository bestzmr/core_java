package tech.aistar.day10.myhomework2;

/**
 * @author: Merlin
 * @time: 2020/7/31 20:12
 */
public class HourEmp extends Emp{
    private double salaryPerHour = 15.0d;
    private double hours;

    public HourEmp(double hours) {
        this.hours = hours;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double calcSalary() {
        return getHours()*getSalaryPerHour();
    }
}
