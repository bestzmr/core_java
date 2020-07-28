package tech.aistar.day07.homework;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/28 8:38 上午
 */
public class TestComputer {
    public static void main(String[] args) {
        //1. 通过构造进行赋值 + setter来设置关联的对象
        Computer c = new Computer("mac pro",10000.0d,"ok",null);

        //2. 准备显示器对象
        Display display = new Display("液晶",17,"三星");

        //将显示器对象绑定到计算机对象上.
        c.setDisplay(display);

        System.out.println(c);

        System.out.println("============");

        Display display1 = new Display("液晶",17,"三星");
        Computer c1 = new Computer("mac pro",10000.0d,"ok",display1);
        System.out.println(c1);
    }
}
