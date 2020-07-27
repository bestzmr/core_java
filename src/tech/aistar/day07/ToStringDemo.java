package tech.aistar.day07;

import java.util.Date;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/27 2:58 下午
 */
public class ToStringDemo {
    public static void main(String[] args) {
        User user = new User(1,"admin","123",new Date());

        //没有重写toString方法之前,打印对象,出来的是内存地址

        //打印对象的时候,实际上在调用该对象的toString方法
        System.out.println(user);//tech.aistar.day07.User@330bedb4

        //User实体中并没有提供String toString();

        //当一个实体类没有手动指定它的父类的时候,那么这个类将会直接继承java.lang.Object
        //java.lang.Object这个类是所有对象的超类,父类,根类,基类.

        //默认提供的toString输出,并不满足我们实际的打印需求
        //实际的打印需求 - 返回对象中的属性的字符串表现形式
        System.out.println(user.toString());

        //需要在User类中自己手动提供toString方法来满足实际的打印需求.

//        Date date = new Date();
//        System.out.println(date.toString());
//
//        String str = "abc";
//        System.out.println(str.toString());

    }
}
