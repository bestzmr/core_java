package tech.aistar.day14.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: Merlin
 * @time: 2020/8/10 17:55
 */
public class RemoveListDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book b1 = new Book(1, "1001", "java");
        Book b2 = new Book(1, "1001", "java");
        Book b3 = new Book(1, "1001", "java");
        Book b4 = new Book(1, "1001", "java");
        Book b5 = new Book(1, "1001", "java");

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        safeDel(books, "java");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void removeByBookName(List<Book> books, String bookName) {
        for (int i = books.size(); i >= 0; i--) {
            if (books.get(i).getBookName().equals(bookName)) {

                books.remove(i);
            }
        }
    }

    private static void unSafeDel(List<Book> list, String bookName) {
        for (Book book : list) {
            if (book.getBookName().equals(bookName)) {
                list.remove(book);
            }
        }


    }

    private static void safeDel(List<Book> list, String bookName) {
        Iterator<Book> iterator = list.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getBookName().equals(bookName)) {
                iterator.remove();

            }
        }
    }
}
