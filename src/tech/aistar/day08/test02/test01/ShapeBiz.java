package tech.aistar.day08.test02.test01;

import tech.aistar.day08.relation.homework.Circle;
import tech.aistar.day08.relation.homework.Rect;
import tech.aistar.day08.relation.homework.Shape;

/**
 * 本类用来演示:形状业务类 - 负责输出周长和面积
 *
 * @author: success
 * @date: 2020/7/29 9:46 上午
 */
public class ShapeBiz {

//    public void rectGirth(Rect rect){
//        System.out.println(rect.girth());
//    }
//
//    public void circleGirth(Circle circle){
//        System.out.println(circle.girth());
//    }

    //采用多态的应用2 - 方法的参数类型可以写成父类,那么调用方法的时候
    //可以传入这父类的任何一个子类对象
    public void shapeGirth(Shape s){

        //调用的时候调用的是子类重写之后的方法.
        System.out.println(s.girth());
    }

}