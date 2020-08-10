package tech.aistar.day14;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/10 10:06 上午
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Book> sets = new HashSet<>();//无序不可重复..
        Book b1 = new Book(1,"1001","java");
        Book b2 = new Book(3,"1002","python");
        Book b3 = new Book(3,"1003","java");
        sets.add(b1);
        sets.add(b2);
        sets.add(b3);

        //用了使用lambda表达式
        //jdk8.0使用表达式来代替匿名内部类 - 前提函数式接口的.

//        sets.forEach(new Consumer<Book>() {
//            @Override
//            public void accept(Book book) {
//                System.out.println(book);
//            }
//        });

        //jdk8.x中提供的新的特性...
        sets.forEach(b-> System.out.println(b));

        sets.forEach(System.out::println);
    }
}
