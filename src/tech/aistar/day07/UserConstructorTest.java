package tech.aistar.day07;

/**
 * 本类用来演示:构造方法的使用
 *
 * @author: success
 * @date: 2020/7/27 1:57 下午
 */
public class UserConstructorTest {
    public static void main(String[] args) {
        User u1 = new User();
        //setter方法可以进行多次赋值
        u1.setId(10);
        u1.setId(20);
        System.out.println(u1.getId());

        //创建对象的同时对对象中的属性进行赋值.

        //user(栈)   ->    new User(10);[堆]
        User user = new User(10);//赋值的机会只有一次.如果想要进行多次赋值,可以配合setter方法

        user.setId(100);


        //又在堆里面新开辟了一块空间了.然后进行对象的初始化,然后将栈里面的引用
        //user重新指向了第二次创建出来的对象.
        //这个时候,第20行[第一次创建出来的对象已经没有任何引用指向了],
        //第一次创建出来的对象已经变成了垃圾对象[没有任何引用指向的对象]
        //垃圾对象被垃圾回收机制[GC]进行回收 - 目的:释放内存.
        //user = new User(20);//error

        System.out.println(user.getId());

        System.out.println("=======");

        User u2 = new User(1,"习大大",null,null);
        //u2.setUsername("习大大");
        System.out.println(u2.getUsername());

        System.out.println("====this关键字作用===");

        User u3 = new User(100,"james","123");

        System.out.println(u3.getId());
    }
}
