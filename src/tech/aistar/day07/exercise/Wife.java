package tech.aistar.day07.exercise;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/27 3:34 下午
 */
public class Wife {
    private int id;

    private String name;

    public Wife() {
    }

    public Wife(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wife{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
