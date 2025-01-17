package tech.aistar.day08.relation.extend;

/**
 * 本类用来演示: 父类 - 存放各个子类共同的特征和行为
 *
 * @author: success
 * @date: 2020/7/28 2:25 下午
 */
public class Animal {//当一个类没有指定父类的时候,那么这个类的直接父类是Object
    //各个子类中共同的属性放在父类
    private String name;

    private int age;

    public Animal() {
        System.out.println("Animal空参构造被调用了...");
   }

    //回忆:一旦某个类中手动提供了任何一个构造的时候,那么系统将不会再分配一个空参构造了.
    public Animal(String name, int age) {
        System.out.println("Animal带参构造被调用了!!!!");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //存放子类共同的行为
    public void sleeping(){
        System.out.println(name+"在睡觉!");
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public void spark(){
        System.out.println("动物在叫...");
    }
}
