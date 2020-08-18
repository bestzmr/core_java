package tech.aistar.day17.practice;

/**
 * @author: Merlin
 * @time: 2020/8/18 9:22
 */
public class Point {
    private int x;
    private String y;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("x=").append(x);
        sb.append(", y='").append(y).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
