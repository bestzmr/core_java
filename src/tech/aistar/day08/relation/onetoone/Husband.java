package tech.aistar.day08.relation.onetoone;

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

    public Husband() {
    }

    public Husband(int id, String name, Wife wife) {
        this.id = id;
        this.name = name;
        this.wife = wife;
    }

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Husband{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
