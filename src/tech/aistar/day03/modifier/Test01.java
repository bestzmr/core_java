package tech.aistar.day03.modifier;

/**
 * 本类用来演示:方法的定义者
 *
 * @author: success
 * @date: 2020/7/20 8:38 上午
 */
public class Test01 {
    //public - 公开的,公共的 - 该方法对外暴露
    public void test01(){
        System.out.println("test01...");
    }

//    私有方法 - private - 只能在本类中进行调用
    private void test02(){
        System.out.println("test01...");
    }

    public static void test03(){
        System.out.println("test03...");
    }
}
