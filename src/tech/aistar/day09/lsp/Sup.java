package tech.aistar.day09.lsp;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/29 10:46 上午
 */
public class Sup {
    public void test(Father father){
        System.out.println("Sup...");
    }

    public void tests(FatherSub fatherSub){
        System.out.println("Sup...");
    }
}
class Sub extends Sup{

    //子类的参数的类型要小
    public void test(FatherSub fatherSub) {
        System.out.println("Sub...");
    }

    //当子类覆盖或实现父类的方法时，方法的前置条件（即方法的形参）
    // 要比父类方法的输入参数更宽松
    public void tests(Father father){
        System.out.println("Sub...");
    }
}

class TestSub{
    public static void main(String[] args) {
        Father father = new Father();//定义一个父类对象
        Father fatherSub = new FatherSub();//定义一个father的子类

        Sub sub = new Sub();
        //不符合"里氏替换原则"
        //核心 - 凡是可以出现父类的地方,都可以使用子类来替代.

        //不行的结果:一旦使用子类替代父类之后,执行的结果是不一样的.

        //子类是不推荐重写父类的普通方法的 - 因为父类中已经定义好了结构,子类不要轻易去破坏这个结构.
        sub.test(father);//Sup...
        sub.test(fatherSub);//Sub...

        System.out.println("===");
        //使用子类来替代父类,不影响执行的结果
        sub.tests(father);//Sub..
        sub.tests(fatherSub);//Sub...
    }
}
