package tech.aistar.day08.relation.homework;

/**
 * @author: Merlin
 * @time: 2020/7/28 17:41
 */

/**
 * 圆形
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public void getPerimeter() {
        if (getRadius() <= 0) {
            return;
        }
        System.out.println("圆形周长:"+(2*Math.PI*getRadius()));
    }


    public void getArea() {
        if (getRadius() <= 0) {
            return;
        }
        System.out.println("圆形面积:" + (Math.PI * Math.pow(getRadius(), 2)));
    }
}
