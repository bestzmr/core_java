package tech.aistar.day10.all;

/**
 * 本类用来演示:总的父类 - 相声演员
 *
 * @author: success
 * @date: 2020/7/31 3:20 下午
 */
public class Player {
    //共同的特征
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Player{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
