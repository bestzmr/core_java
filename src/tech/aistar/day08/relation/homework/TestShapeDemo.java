package tech.aistar.day08.relation.homework;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/28 7:04 下午
 */
public class TestShapeDemo {
    public static void main(String[] args) {
        Shape square = new Square(10);
        System.out.println(square.area());

        System.out.println(square.girth());
    }
}
