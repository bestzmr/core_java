package tech.aistar.day03;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/18 11:21 上午
 */
public class TestMethod02 {
    public static void main(String[] args) {
        //1. 创建对象
        TestMethod02 t1 = new TestMethod02();
        t1.test02();

        System.out.println(t1);
    }

    public void test01(){
        System.out.println("test01...");
    }

    public void test02(){
        //test02中想要调用test01().
        //非静态方法中怎么去调用非静态方法.

//        TestMethod02 t1 = new TestMethod02();
//        t1.test01();

        //结论: 前提:在同一个类中
        //非静态方法中是可以直接去调用本类中的另外一个非静态方法的

        //本质是省略调用了关键字this
        //test01();
        //this代表的就是当前对象(调用test02这个方法的对象)
        //this.test01();
        //System.out.println(this);

        test01();

        System.out.println("test02...");

        test03();
    }

    public static void test03(){
//        test01();
        System.out.println("test03");
    }
}
