package tech.aistar.day10.myhomework;

import java.util.Arrays;

/**
 * @author: Merlin
 * @time: 2020/7/31 19:44
 */
public class ArrayBookBiz implements IBookBiz {
    private static final int CAPACITY = 5;
    private int count;//代表有效图书数量
    private Book[] books = new Book[CAPACITY];

    @Override
    public void deleteById(String id) {
        Book[] temp = new Book[count - 1];
        boolean flag = false;
        int pos = 0;
        for (int i = 0; i < books.length; i++) {
            if (!books[i].getId().equals(id)) {
                flag = true;
                temp[pos++] = books[i];
            }
        }
        if (flag) {
            count--;
            books = temp;
        }
    }

    @Override
    public void add(Book book) {
        if (count >= 5) {
            books = Arrays.copyOf(books, books.length + 1);
            books[count] = book;
            count++;

        } else {
            books[count] = book;
            count++;
        }
    }

    @Override
    public void deleteByName(String name) {
        Book[] temp = new Book[count - 1];
        boolean flag = false;
        int pos = 0;
        for (int i = 0; i < books.length; i++) {
            if (!books[i].getName().equals(name)) {
                flag = true;
                temp[pos++] = books[i];
            }
        }
        if (flag) {
            count--;
            books = temp;
        }
    }

    @Override
    public void outputAllBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
