package tech.aistar.day03.imports.b;


import java.util.Date;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/20 10:01 上午
 */
public class JDkImportDemo {
    public static void main(String[] args) {
        String name = "ok";
        System.out.println(name);

        //演示导包 - 除了java.lang下不需要导包,其他包都是需要手动导入的
        Date d = new Date();
        System.out.println(d);//Mon Jul 20 10:04:54 CST 2020

        int result = (int) Math.pow(2,3);
        System.out.println(result);
    }
}
