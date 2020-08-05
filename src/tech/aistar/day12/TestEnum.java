package tech.aistar.day12;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/5 2:53 下午
 */
public class TestEnum {
    public static void main(String[] args) {
        System.out.println(EnumDemo.SPRING);//枚举类型.枚举实例 -> 枚举常量的名称

        System.out.println("--");

        //将所有的枚举实例全部获取放到数组中
        EnumDemo[] enumDemos = EnumDemo.values();
        for (EnumDemo e : enumDemos) {
            System.out.println(e);//枚举常量的名称,因为重写了toString方法.
        }

        //枚举实例是不允许在外部进行new的.

        //EnumDemo e1 = new EnumDemo();
    }
}
