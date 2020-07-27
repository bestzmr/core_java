package tech.aistar.day07.exercise;

import java.util.Arrays;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/27 3:33 下午
 */
public class Husband {
    private int id;

    private String name;

    //对象与对象之间是有关系的.
    //一个丈夫对应一个妻子 1:1

    //在丈夫的实体类中维护了一个单个妻子对象.
    private Wife wife;

    //远古时代 - 一个丈夫对应多个妾 1:N
    private Concubine[] concubine;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public Concubine[] getConcubine() {
        return concubine;
    }

    public void setConcubine(Concubine[] concubine) {
        this.concubine = concubine;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Husband{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", wife=").append(wife);
        sb.append(", concubine=").append(Arrays.toString(concubine));
        sb.append('}');
        return sb.toString();
    }
}
