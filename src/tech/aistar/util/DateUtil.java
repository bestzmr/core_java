package tech.aistar.util;

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
}
