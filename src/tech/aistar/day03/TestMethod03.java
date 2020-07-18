package tech.aistar.day03;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/18 1:58 下午
 */
public class TestMethod03 {

    static int id = 100;

    public static void main(String[] args) {
      //TestMethod03 t = new TestMethod03();
      //t.test02();

        //System.out.println(t);

       // test03();//静态方法中是可以直接调用静态方法的.

        test03();


    }

    public void test01(){
        System.out.println("test01");
    }

    /**
     * 1. 调用方式
     *
     * 2. 能否调用
     *
     * test01能够被成功调用的前提是先调用test02,而调用test02的前提是必须要创建一个对象.
     *
     * 所以当程序如果能够顺利执行到test01(),内存中肯定已经存在所需要的this对象
     */
    public void test02(){
        //对象.成员
//        TestMethod03 t = new TestMethod03();
//        t.test01();

        //结论:前提:在同一个类中
        //前提:非静态方法中是允许直接调用非静态方法的 - 省略对象
        //test01();

        //简写的代码的背后是省略的this关键字.

        test01();

        //this代表的是当前对象(调用当前方法test02这个方法的对象)

        //System.out.println(this);

        System.out.println("test02");

        //非静态方法中是否可以直接调用静态方法 - 可以的
        //TestMethod03.test03();

        test03();//test03早就已经在内存"躺着了..."
    }

    public static void test03(){
        //静态方法中如何调用非静态方法呢? - 对象.方法
        TestMethod03 t = new TestMethod03();
        t.test01();
        System.out.println("test03...");
    }

    public void test04(){
        //static int i = 10;
    }

    public static void test05(){
        //static int i = 10;

        System.out.println(id);
    }
}
