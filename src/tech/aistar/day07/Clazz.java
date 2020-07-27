package tech.aistar.day07;

/**
 * 本类用来演示:班级实体类 - 描述对象的
 *
 * @author: success
 * @date: 2020/7/27 9:50 上午
 */
public class Clazz {
    private int id;

    private int capacity;//容量

    //alter+insert - win
    //control+enter - mac


    public Clazz() {
    }

    public Clazz(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
