package tech.aistar.day06;

import java.util.Calendar;
import java.util.Date;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/24 2:06 下午
 */
public abstract class CalendarDemo {
    public static void main(String[] args) {
        //1. 构建日历对象
        //设计模式 - 简单工厂设计模式.
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        //2. 获取日历中的指定的字段
        //int year = cal.get(1);//直接传入的是一个字面量

        //Calendar.YEAR = 10;

        int year = cal.get(Calendar.YEAR);//通过常量进行赋值 - 提高程序的可读性.
        System.out.println("year:"+year);

        int month = cal.get(Calendar.MONTH)+1;
        System.out.println("month:"+month);

        //周日-week=1
        int week = cal.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println(week);//5

        int date = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("date:"+date);

        //访问Calendar中提供的字段
        int yearField = Calendar.YEAR;
        System.out.println(yearField);

        System.out.println("=====设置日历字段=====");

        //对日历字段进行一一赋值
        Calendar dar = Calendar.getInstance();
        //dar.set(1,2022);
        //dar.set(Calendar.YEAR,2022);
        //dar.set(Calendar.MONTH,4);

        //对多个字段进行同时赋值
        dar.set(2022,4,1);

        System.out.println(dar);

        //日历->日期
        Date now = dar.getTime();
        System.out.println(now);

        Date dt = new Date(1991-1900,4,5);

        //日期->日历
        dar.setTime(dt);

        System.out.println(dar);

        //日期<->long
        //long->Date
        //1. Date(long time);
        //2. void setTime(long time);

        //Date->long
        //1. void setTime(long time);


        //日历->日期
        //Date getTime();//java.util.Calendar

        //日期->日历
        //void setTime(Date d);//java.util.Calendar;
    }
}

