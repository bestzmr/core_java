package tech.aistar.day03.transfer;

/**
 * 本类用来演示: 方法的参数传递的方式
 *
 * @author: success
 * @date: 2020/7/20 1:48 下午
 */
public class TransferDemo {
    public static void main(String[] args) {
        //基本类型 - 采用的是值传递.基本类型的变量中保存的就是数据

        int a = 10;
        int b = 20;

        //方法 -  交换俩个变量的数据
        //方法传参的时候 - 将变量a中保存的数据10的副本传递一份给了方法中的形参a

        //想象成"文件的拷贝". - 修改文件的副本,不会对文件的原文件产生任何影响.
        change(a,b);

        System.out.println("a->"+a);//a->10
        System.out.println("b->"+b);//b->20
    }

    private static void change(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a:"+a);//a:20
        System.out.println("b:"+b);//b:10
    }
}
