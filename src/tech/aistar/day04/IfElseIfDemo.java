package tech.aistar.day04;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/20 3:29 下午
 */
public class IfElseIfDemo {
    public static void main(String[] args) {
        int maxDays = getMaxDay(2021,2);
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
        int day = -1;//定义一个变量,用来保存最大天数.

        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
            day = 31;
        else if(month == 2){
            //判断是否为闰年
            //boolean flag = isLeapYear(year);
//            if(flag)
//                day = 29;
//            else
//                day = 28;

//            day = 28;
//            if(flag)
//                day++;

//            使用三元运算符
            //day = flag?29:28;

            day = isLeapYear(year)?29:28;

        }else
            day = 30;
        return day;
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
