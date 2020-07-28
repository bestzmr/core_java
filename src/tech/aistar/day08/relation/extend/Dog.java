package tech.aistar.day08.relation.extend;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/28 2:25 下午
 */
public class Dog extends Animal{

    //子类中存放自己独有的属性
    private double loyalty;//忠诚度

    public Dog() {
//        在子类中的任何一个构造方法中,系统都会默认分配一个super();
//
//        前提:子类中的构造中没有手动提供任何一个super([参数列表]).

        //super();//调用父类已经存在的空参构造.

        System.out.println("Dog()空参构造被调用了...");
    }

    public double getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(double loyalty) {
        this.loyalty = loyalty;
    }

    //子类中可以定义自己独有的方法
    public void watchDoor(){
        System.out.println(getName()+"会看门!");
    }
}
