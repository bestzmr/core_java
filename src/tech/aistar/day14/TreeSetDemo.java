package tech.aistar.day14;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * 本类用来演示: 传入一个比较器接口对象来定制排序的规则
 *
 * @author: success
 * @date: 2020/8/11 2:09 下午
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Book b1 = new Book(1,"1001","java",100.0);
        Book b2 = new Book(2,"1002","java",200.0);
        Book b3 = new Book(3,"1003","java",200.0);
        Book b4 = new Book(4,"1004","java",400.0);

        //如果涉及到定制排序,一定要慎用,排序的字段如果有重复的,则拒绝添加.
        //一般是使用它来对唯一性的字段来进行排序.
        Comparator<Book> c = (o1,o2)->{
            return (int) (o1.getPrice() - o2.getPrice());
        };

        TreeSet<Book> books = new TreeSet<>(c);

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        books.forEach(e-> System.out.println(e));
    }
}
