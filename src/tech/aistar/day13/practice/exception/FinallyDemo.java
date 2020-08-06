package tech.aistar.day13.practice.exception;

import tech.aistar.day10.homework.book.Book;

/**
 * @author: Merlin
 * @time: 2020/8/6 20:58
 */
public class FinallyDemo {
    public static void main(String[] args) {
        add();
        System.out.println(test01());
        System.out.println(test02());
        System.out.println(test03());

    }
    public static void add() {
        try {
            int i = 0;
            System.out.println("try.../");
            return;
        }finally {
            System.out.println("finally");
        }

    }

    public static int test01() {
        int i = 0;
        try {
            ++i;
            return i;
        }finally {
            ++i;
        }
    }

    public static int test02(){
        int i = 0;
        try {
            ++i;
            return i;
        }finally {

            return ++i;
        }
    }
    public static Book test03() {
        Book b1 = new Book(1, "1001", "java");
        try {
            b1.setBookName("python");
            return b1;
        }finally {
            b1.setBookName("web签单");
        }
    }
}
