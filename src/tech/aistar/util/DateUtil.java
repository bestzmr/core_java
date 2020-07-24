package tech.aistar.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 本类用来演示:日期工具类
 *
 *            工具类中的方法推荐定义static - 方便调用
 *
 * @author: success
 * @date: 2020/7/22 9:14 上午
 */
public class DateUtil {

    /**
     * 求出某年某月的最大天数
     * @param year
     * @param month
     * @return
     */
    public static int getMaxDays(int year,int month){
        //定义一个变量 - 最大天数
        int days = -1;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                days = isLeapYear(year)?29:28;
                break;
            default:
                days = 30;
                break;
        }
        return days;
    }

    /**
     * 判断某年是否闰年
     * @param year
     * @return
     */
    public static boolean isLeapYear(int year){
        return (year % 4==0 && year % 100 !=0) || year % 400 == 0;
    }

    /**
     * 获取某年某月某日是周几
     * @param year
     * @param month
     * @param date
     * @return
     */
    public static int getDayOfWeek(int year,int month,int date){
        Calendar calendar = Calendar.getInstance();

        //对日历对象进行重新设置值
        calendar.set(year,month-1,date);

        int week = calendar.get(Calendar.DAY_OF_WEEK)-1;
        return week;
    }

    /**
     * 日期格式化成指定模板的字符串表现形式
     * @param date
     * @param pattern
     * @return
     */
    public static String format(Date date,String pattern){
        //1. 构建SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        if(null == date)
            return null;

        String sdate = sdf.format(date);

        return sdate;
    }

    /**
     * 将字符串解析成日期对象
     * @param sdate
     * @param pattern
     * @return
     */
    public static Date parse(String sdate,String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        if(null == sdate || sdate.trim().length() == 0)
            return null;

        Date date = null;
        try {
            date = sdf.parse(sdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
