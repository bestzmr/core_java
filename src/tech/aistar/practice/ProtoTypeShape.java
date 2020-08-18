package tech.aistar.practice;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: Merlin
 * @time: 2020/8/18 13:45
 */
interface Shape extends Cloneable {
    public Object clone();
    public void countArea();
}

class Circle implements Shape {
    Circle w = null;

    @Override
    public Object clone() {
        try {
            w = (Circle) super.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝圆失败");

        }
        return w;


    }

    @Override
    public void countArea() {
        int r = 0;
        System.out.println("这是一个圆，请输入圆的半径");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
        System.out.println("该圆的面积=" + 3.1415 * r * r + "\n");
    }
}

class Square implements Shape {

    @Override
    public Object clone() {
        Square b = null;
        try {
            b = (Square) super.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝正方形失败");

        }
        return b;
    }

    @Override
    public void countArea() {

        int a = 0;
        System.out.println("这是一个正方形，请输入它的边长");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("该正方形的面积" + a * a + "\n");
    }

    class ProtoTypeManager {
        private HashMap<String, Shape> ht = new HashMap<>();
        public ProtoTypeManager() {
            ht.put("Circle", new Circle());
            ht.put("Square", new Square());

        }

        public void addShape(String key, Shape object) {
            ht.put(key, object);
        }

        public Shape getShape(String key) {
            Shape temp = ht.get(key);
            return (Shape) temp.clone();
        }


    }

}
public class ProtoTypeShape {
    public static void main(String[] args) {

    }
}
