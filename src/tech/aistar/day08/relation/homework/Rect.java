package tech.aistar.day08.relation.homework;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/28 7:02 下午
 */
public class Rect extends Shape{

    private int len;

    private int width;

    public Rect() {
    }

    public Rect(int len, int width) {
        this.len = len;
        this.width = width;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rect{");
        sb.append("len=").append(len);
        sb.append(", width=").append(width);
        sb.append('}');
        return sb.toString();
    }

    //重写父类中的俩个方法

    @Override
    public double area() {
        return len * width;
    }

    @Override
    public double girth() {
        return 2*(len + width);
    }
}
