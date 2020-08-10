package tech.aistar.day14.practice;

import java.util.LinkedList;

/**
 * @author: Merlin
 * @time: 2020/8/10 17:48
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Book> list = new LinkedList<>();

        Book b1 = new Book(1,"1001","java");
        Book b2 = new Book(2,"1002","python");
        Book b3 = new Book(3,"1003","web");

        Book b4 = new Book(4,"1004","web");
        Book b5 = new Book(5,"1005","web");
        Book b6 = new Book(6,"1006","web");
        Book b7 = new Book(7, "1007", "web");

        list.add(b1);
        list.add(b2);
        list.add(b3);

        list.addLast(b4);
        list.addFirst(b5);

        list.push(b6);

        System.out.println(list.pop());
        System.out.println(list.removeFirst());

        System.out.println(list.removeLast());
        System.out.println(list.element());

        list.offerFirst(b7);
        System.out.println("---------------");
        list.forEach(e -> System.out.println(e));
        System.out.println("=====华丽丽的分割线=====");

        System.out.println(list.size());
        System.out.println(list.getFirst());

        System.out.println(list.remove(1));

    }
}
