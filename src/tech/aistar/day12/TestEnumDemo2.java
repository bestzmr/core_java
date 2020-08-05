package tech.aistar.day12;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/5 3:01 下午
 */
public class TestEnumDemo2 {
    public static void main(String[] args) {
        for (EnumDemo2 e : EnumDemo2.values()) {
            System.out.println(e + ":" + e.getSign());
        }
    }
}
