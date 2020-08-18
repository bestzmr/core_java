package tech.aistar.practice;

/**
 * @author: Merlin
 * @time: 2020/8/18 13:42
 */
public class ProtoTypeCitation {
    public static void main(String[] args) {

    }
}

class citation implements Cloneable {
    String name;
    String info;
    String college;

    citation(String name, String info, String college) {

        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功");

    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + info + college);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功");

        return (citation) super.clone();
    }

}
