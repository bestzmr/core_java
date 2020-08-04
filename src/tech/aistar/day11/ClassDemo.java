package tech.aistar.day11;

import tech.aistar.day08.relation.extend.Animal;
import tech.aistar.day08.relation.extend.Cat;

/**
 * 本类用来演示:获取类的class实例
 *
 * 一个类无论被实例化多少次,它在内存中的class实例永远只有1个.
 *
 * @author: success
 * @date: 2020/8/4 10:09 上午
 */
public class ClassDemo {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();

        Class<?> c = b1.getClass();//对象.getClass();
        //Class实例是用来描述类的类.
        //类有什么东西是可以被描述的???
        //比如类的名称
        String name = c.getName();//tech.aistar.day11.Book
        String simpleName = c.getSimpleName();//Book
        System.out.println(name);
        System.out.println(simpleName);


        Class<?> c2 = b2.getClass();//对象.getClass();

        System.out.println(c);//class tech.aistar.day11.Book
        System.out.println(c2);//class tech.aistar.day11.Book

        System.out.println(c == c2);//true

        //2. 直接通过类名.class
        Class<?> c3 = Book.class;
        System.out.println(c3);//class tech.aistar.day11.Book


        //3. 使用场景比较多的
        try {
            //class tech.aistar.day11.Book
            Class<?> c4 = Class.forName("tech.aistar.day11.Book");
            System.out.println(c4);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //4.基本数据类型.class
        System.out.println(int.class);//int


        //结论:Class实例 - 对象的运行时类型.
        Animal cat = new Cat();

        System.out.println(cat.getClass());//class tech.aistar.day08.relation.extend.Cat
    }
}
