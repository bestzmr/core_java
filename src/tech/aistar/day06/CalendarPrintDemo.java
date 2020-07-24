package tech.aistar.day06;

import tech.aistar.util.DateUtil;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 本类用来演示:日历练习
 *
 * @author: success
 * @date: 2020/7/24 3:08 下午
 */
public class CalendarPrintDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入年份:>");
        int year = sc.nextInt();
        System.out.print("输入月份:>");
        int month = sc.nextInt();

        printCalendar(year,month);
    }

    private static void printCalendar(int year, int month) {
        //参数有效性判断
        if(year<=0 || month<1 || month>12){
            System.out.println("参数不合法!");
            return;
        }
        //1. 获取某年某月最大天数
        int maxDays = DateUtil.getMaxDays(year,month);

        //2. 获取今天是几号
        int date = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        //3. 获取某年某月1号是周几
        int week = DateUtil.getDayOfWeek(year,month,1);

        //定义一个计数器 - 控制换行
        int count = 0;

        System.out.println("\t\t"+year+"年"+month+"月");
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        for (int i = 0; i < week; i++) {
            System.out.print("\t");
            count++;
        }

        for (int i = 1; i <=maxDays; i++) {
            System.out.print(i==date?(i+"*\t"):(i+"\t"));
            count++;
            if(count==7){
                System.out.println();
                count = 0;
            }
        }
    }
}
