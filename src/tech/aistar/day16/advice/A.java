package tech.aistar.day16.advice;

/**
 * @author: Merlin
 * @time: 2020/8/14 13:21
 * 小练习
 */
class B {
    public static int y = A.x + 1;
    public static void main(String[] args) {
        System.out.println(String.format("x=%d,y=%d", A.x, B.y));
    }
}
public class A {
    public static int x;
    static {
        x = B.y + 1;
    }
}