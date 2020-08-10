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

        list.add(b1);
    }
}
