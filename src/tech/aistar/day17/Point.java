package tech.aistar.day17;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/18 8:48 上午
 */
public class Point {
    //私有的属性
    //私有的2
    private int x;

    private String y;

//    int m;//默认的是0
//
//    //受保护的是4
//    protected int n;
//
//    //公开的是1
//    public int z;


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("x=").append(x);
        sb.append(", y='").append(y).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
