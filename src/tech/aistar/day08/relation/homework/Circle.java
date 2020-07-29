package tech.aistar.day08.relation.homework;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/29 8:43 上午
 */
public class Circle extends Shape{
    private double radius;//半径

    private static final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    //子类可以选择性去重写父类中的方法.
    @Override
    public double area() {
        return PI*Math.pow(radius,2);
    }

    @Override
    public double girth() {
        return 2*PI*radius;
    }
}
