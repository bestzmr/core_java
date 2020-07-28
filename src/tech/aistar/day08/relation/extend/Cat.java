package tech.aistar.day08.relation.extend;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/28 2:25 下午
 */
public class Cat extends Animal{
    private double cute;//可爱,萌度...

    public Cat() {
        System.out.println("Cat()...");
    }

    public Cat(String name,int age,double cute){
        //调用父类中存在的两参构造
        super(name,age);//一定要出现在首行
        System.out.println("Cat()带参构造被调用了...");

        this.cute = cute;
    }

    public double getCute() {
        return cute;
    }

    public void setCute(double cute) {
        this.cute = cute;
    }

    //子类可以提供特有的行为
    public void catchMouse(){
        System.out.println(getName()+"会捉老鼠!");
    }
}
