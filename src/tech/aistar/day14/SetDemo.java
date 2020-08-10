package tech.aistar.day14;

import java.util.HashSet;
import java.util.Set;

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

        sets.forEach(e-> System.out.println(e));
    }
}
