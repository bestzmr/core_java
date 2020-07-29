package tech.aistar.day08.relation.homework03;

import java.util.Calendar;
import java.util.Date;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/29 8:56 上午
 */
public class Emp {
    //姓名
    private String name;

    //生日
    private Date birthday;

    public Emp() {
    }

    public Emp(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary(int month){
        //将Date类型->Calendar类型
        Calendar cal = Calendar.getInstance();
        cal.setTime(birthday);//利用指定的date类型来构建日历类型.

        //定义一个变量
        double salary = 0.0d;

        if(cal.get(Calendar.MONTH)+1 == month)
            salary = 100.0d;

        return salary;
    }
}
