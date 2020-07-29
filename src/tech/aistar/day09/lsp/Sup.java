package tech.aistar.day09.lsp;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/29 10:46 上午
 */
public class Sup {
    public void test(Father father){//多态的应用2 - 方法的参数类型写成父类,传入可以是子类.
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
        //继承带来的缺陷 - 一旦使用到了继承,增加了父子模块之间的耦合性.
        //降低了程序代码的灵活度,修改父类,可能会影响到子类.

        //子类是允许拓展父类的功能,但是不建议子类去修改父类的功能.
        //子类重写父类方法是违背这个思想 - 降低了代码的复用性.
        //所以父类一旦定义好了的结构,子类尽量不要去破坏.
        //基于上面的思想 - "里氏替换原则" - 凡是可以使用父类的地方,也是允许使用子类.
        //人话: 父类修改功能的时候,尽量不要影响子类.
        //1. 子类不要重写父类的非抽象方法.
        //2. 子类方法的形参要比父类形参要更加宽松.

        FatherSub fatherSub = new FatherSub();

        //此处代码使用父类...
        Sup sup = new Sup();
        sup.test(fatherSub);//不推荐...   Sup...

        //"里氏替换原则" - 凡是可以使用父类的地方,也是允许使用子类.
        //一旦使用子类Sub来替代Sup父类,期望得到的效果是一样的,但是实际上不一样 - 不能够替换.
        Sub sub = new Sub();
        sub.test(fatherSub);//Sub..

        System.out.println("====里氏替换原则=====");

        //又在使用父类...
        Sup sup1 = new Sup();
        sup1.tests(fatherSub);//Sup...

        //使用子类Sub来替换
        Sub sub2 = new Sub();
        sub2.tests(fatherSub);//Sup... - 还是在调用父类的定义好的东西

        //Sub子类中也提供了tests(Father Father)
        //1. 子类依然可以使用父类提供好的结构
        //2. 子类对父类进行了拓展,并且没有改变父类的功能.
        Father father = new FatherSub();
        sub2.tests(father);//Sub...
    }
}
