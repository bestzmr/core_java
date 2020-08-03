package tech.aistar.day11;

import java.util.Arrays;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/3 2:46 下午
 */
public class ObjectMethodDemo {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);//false

        System.out.println(s1.equals(s2));//true

        System.out.println("====");

        Book b1 = new Book(1,"1002","java");
        Book b2 = new Book(1,"1002","python");
        System.out.println(b1 == b2);//false

        //System.out.println(b1.equals(b2));//true

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(arr1 == arr2);//false
        System.out.println(arr1.equals(arr2));//false
        System.out.println(Arrays.equals(arr1,arr2));//true

        System.out.println("=====");

        Book b3 = new Book(1,"1002","java");
        BookInfo bookInfo = new BookInfo(1,"这是一本好书!");
        System.out.println(bookInfo);
        b3.setInfo(bookInfo);

        Book b4 = new Book(1,"1002","python");
        BookInfo bookInfo2 = new BookInfo(1,"这是一本好书!");
        b4.setInfo(bookInfo2);

        System.out.println(b3.equals(b4));

    }
}
