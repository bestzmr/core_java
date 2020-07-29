package tech.aistar.day08.relation.homework;

/**
 * 本类用来演示: 继承的精髓
 *
 * @author: success
 * @date: 2020/7/28 7:03 下午
 */
public class Square extends Rect{
    private int len;

    public Square() {
    }

    public Square(int len){
        super(len,len);
    }
}
