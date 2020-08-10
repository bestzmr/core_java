package tech.aistar.day14;

import java.util.LinkedList;

/**
 * 本类用来演示:LinkedList
 *
 * @author: success
 * @date: 2020/8/10 10:37 上午
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Book> list = new LinkedList<>();

        Book b1 = new Book(1,"1001","java");
        Book b2 = new Book(2,"1002","python");
        Book b3 = new Book(3,"1003","web");

        list.add(b1);
        list.add(b2);
        list.add(b3);

        //根据下标获取...
        Book b = list.get(2);
        System.out.println(b);
    }
}
