package tech.aistar.practice;

/**
 * @author: Merlin
 * @time: 2020/8/18 10:35
 */
class Realizetype implements Cloneable {
    Realizetype() {
        System.out.println("具体原型创建成功！");

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype)super.clone();
    }
}

public class PrototypeTest {
    public static void main(String[] args) {
        Realizetype obj1 = new Realizetype();
        try {
            Realizetype obj2 = (Realizetype) obj1.clone();
            System.out.println("obj1==obj2?" + (obj1 == obj2));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

}