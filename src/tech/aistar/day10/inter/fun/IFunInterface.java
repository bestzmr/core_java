package tech.aistar.day10.inter.fun;

/**
 * 本类用来演示:函数式接口的作用 - 集合知识点
 *
 *            函数式接口中只能拥有唯一的一个抽象方法.
 *
 * @author: success
 * @date: 2020/7/31 2:58 下午
 */
@FunctionalInterface
public interface IFunInterface {
    //void add(int x);

    void update(int x,String y);

    //void update(int y);
}
class TestFun{
    public static void main(String[] args) {
        //匿名内部类
//        IFunInterface fun = new IFunInterface() {
//            @Override
//            public void add(int x) {
//                System.out.println("x:"+x);
//            }
//        };
//
//        fun.add(10);

        System.out.println("======");
        //为什么要有函数式接口
        //主要是为了配合jdk8.x提供的lambda表达式使用
        //lambda - js箭头函数 -> 简化语法 -> 匿名内部类语法

         //void add(int x);
        //如果重写的方法体中的代码只有一行,那么{}是可以省略不写的.
//        IFunInterface f2 = x -> System.out.println("x:"+x);
//        f2.add(100);

        //void update(int x,String y);
//        IFunInterface f3 = new IFunInterface() {
//            @Override
//            public void update(int x, String y) {
//                System.out.println("x:"+x);
//                System.out.println("y:"+y);
//            }
//        };

        //1. 找参数的个数
        //2. 写方法体中的代码
        IFunInterface f4 = (a,b) -> {
            System.out.println("a:"+a);
            System.out.println("b:"+b);
        };
        f4.update(100,"admin");

        //void find();
        //IFunInterface f5 = () -> {};
    }
}