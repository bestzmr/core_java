package tech.aistar.day09.test01;

import tech.aistar.day08.relation.homework.Rect;
import tech.aistar.day08.relation.homework.Shape;
import tech.aistar.day08.relation.homework.Square;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/29 9:48 上午
 */
public class TestShape {
    public static void main(String[] args) {
        ShapeBiz biz = new ShapeBiz();

        //Rect rect = new Rect(10,5);
        Shape rect = new Rect(10,5);

        biz.shapeGirth(rect);

        Shape s1 = new Square(10);
        biz.shapeGirth(s1);
    }
}
