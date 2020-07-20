package tech.aistar.day04;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/20 3:29 下午
 */
public class IfElseIfDemo {
    public static void main(String[] args) {
        int maxDays = getMaxDay(2020,7);
        System.out.println(maxDays);

        System.out.println(isLeapYear(2021));
    }

    /**
     * 前提2月份 - 判断是否为闰年
     *
     * 闰年 - 能够被4整除,但是不能被100整除
     *       或者能够直接400整除.
     *
     * @param year 年份
     * @param month 月份
     * @return 该年该月最大的天数
     */
    public static int getMaxDay(int year,int month){
        return 0;
    }

    /**
     * 判断是否闰年
     * @param year
     * @return
     */
    public static boolean isLeapYear(int year){
//        if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0){
//            return true;
//        }else{
//            return false;
//        }

//        if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)
//            return true;
//        else
//            return false;

//        if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0)
//            return true;
//        return false;

        return (year % 4 == 0 && year % 100 != 0) || year % 400 ==0;
    }
}
