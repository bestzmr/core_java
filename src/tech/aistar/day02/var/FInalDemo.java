package tech.aistar.day02.var;

/**
 * 本类用来演示:final关键字
 *
 * @author: success
 * @date: 2020/7/18 9:47 上午
 */
public class FInalDemo {

    //种子 - "static"

    //静态的常量
    static final int EMP_AGE = 18;

    public static void main(String[] args) {
        //变量 - 可以多次进行赋值的量.
        int a = 10;
        a = 20;
        a = 30;
        System.out.println(a);//30

        final int B = 200;
       // B = 300;//error

        int age = 16;//模拟的就是从页面上输入的数据
        if(age>=EMP_AGE){
            System.out.println("sorry,你可以犯罪了!");
        }

        //拓展预热 - final未来还要再讲的!!!!
        final String s1 = "a";

        String s2 = "a"+"b";//"ab"

        String s3 = s1 + "b";//"ab"

        System.out.println(s2 == "ab");//true

        System.out.println(s3 == "ab");//true
    }
}
