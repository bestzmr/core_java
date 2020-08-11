package tech.aistar.day14.homework;

import tech.aistar.day10.homework.book.Book;

import java.util.HashMap;
import java.util.Map;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/11 8:54 上午
 */
public class TestMap {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);

        Integer count = map.get(2);
        count+=10;

        map.put(2,count);

        System.out.println(map.get(2));

        Map<Integer, Book> maps = new HashMap<>();
        maps.put(1,new Book(1,"1001","java"));


        Book b = maps.get(1);
        b.setBookName("python");

       // maps.put(1,b);

        System.out.println(maps.get(1));
    }
}
