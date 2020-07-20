package tech.aistar.day03.transfer;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/20 2:11 下午
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder x = new StringBuilder("A");
        StringBuilder y = new StringBuilder("B");

        appenStr(x,y);

        System.out.println("x:"+x);//A
        System.out.println("y:"+y);//BB
    }

    private static void appenStr(StringBuilder x, StringBuilder y) {
        x = y;//一个引用在同一个时刻只能指向一个对象
        y.append("B");
        System.out.println("x->"+x);//BB
        System.out.println("y->"+y);//BB
    }
}
