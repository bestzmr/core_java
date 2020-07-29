package tech.aistar.day08.relation.homework;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/28 7:04 下午
 */
public class TestShapeDemo {
    public static void main(String[] args) {
        //创建一个形状数组
        Shape[] shapes = new Shape[3];

        //多态的应用
        //对象的编译时类型写成父类,对象的运行时类型写成子类
        Shape square = new Square(10);

        Shape rect = new Rect(10,20);

        Shape circle = new Circle(10.0d);

        shapes[0] = square;
        shapes[1] = rect;
        shapes[2] = circle;

        for (Shape s : shapes) {
            System.out.println(s.area());
            System.out.println(s.girth());
            System.out.println("===");
        }

       // System.out.println(0.1+0.2);

        //System.out.println(((1.0 + 2.0)/10));

        //System.out.println((2*314.0*10.0)/100);

    }
}
