package tech.aistar.day03.transfer;

/**
 * 本类用来演示:java.lang.String字符串虽然是一个对象类型,但是在进行方法参数传递的时候,具有"值传递"的特性.
 *
 * 还有一个对象java.util.Date类型.
 *
 * @author: success
 * @date: 2020/7/20 2:29 下午
 */
public class StringTransferDemo {
    public static void main(String[] args) {
        String s = "good";

        change(s);

        System.out.println("s->"+s);//good
    }

    private static void change(String s) {
        s+=" ok";
        System.out.println("s:"+s);//good ok
    }
}
