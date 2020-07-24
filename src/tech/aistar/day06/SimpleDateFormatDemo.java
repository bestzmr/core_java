package tech.aistar.day06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 本类用来演示:日期格式化处理类
 *
 * @author: success
 * @date: 2020/7/24 3:45 下午
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        //1. 利用一个pattern - 日期模板来构建一个格式化类对象
       // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");

        //异常 - 程序在运行的过程中发生了不正常的情况.
        //注意传入的模板的正确性,否则会抛出一个异常java.lang.IllegalArgumentException非法参数异常
       //如果此行发生了异常,那么异常行下面的代码将不会执行了...
        //SimpleDateFormat sdf = new SimpleDateFormat("sucess");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //System.out.println("暗恋");

        //2. 获取当前系统的日期
        Date now = new Date();

        //日期格式化成指定模板形式的字符串.

        //未来的知识点???
        //String format(Date date);//由SimpleDateFormat的"爸爸"DateFormat提供的.

        String sdate = sdf.format(now);

        System.out.println(sdate);

        System.out.println("=====华丽丽的分割线===");

        //把日期形式的字符串 -> 日期类型
        //注意:字符串中的日期的格式要和SimpleDateFormat(String pattern)中的pattern的形式高度保持一致.
        //否则会抛出java.text.ParseException - 解析失败异常
        String str = "2020-09-08";
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

        //把字符串解析成日期类型.
        //未来的知识点 - parse方法的时候,需要手动强制抓取异常
        //alter+enter - 生成try..catch..
        try {

            //如果此行抛出了java.text.ParseException ,那么程序就进入到
            //catch块中去执行里面代码,并且try{}中的此行下面的代码不会执行.
            Date date = format.parse(str);

            System.out.println(date);

        } catch (ParseException e) {
            //e.printStackTrace();//打印异常的堆栈信息...
            //日志的记录...
            System.out.println("解析失败!可能是字符串格式和pattern不匹配!");
        }

        System.out.println("====end====");

    }
}
