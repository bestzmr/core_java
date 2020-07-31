package tech.aistar.day10.all;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/31 3:21 下午
 */
public class PenGen extends Player{
    //特殊的属性...
    private int pen;

    public int getPen() {
        return pen;
    }

    public void setPen(int pen) {
        this.pen = pen;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PenGen{");
        sb.append("pen=").append(pen);
        sb.append('}');
        return sb.toString()+super.toString();
    }
}
