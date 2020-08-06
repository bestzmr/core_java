package tech.aistar.day13;

import tech.aistar.day10.homework.book.Book;

import java.util.HashMap;
import java.util.Map;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/6 1:40 下午
 */
public class EntryDemo<K,V> {
    private K key;

    private V value;

    public EntryDemo() {
    }

    public EntryDemo(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    private void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    private void setValue(V value) {
        this.value = value;
    }

    public void put(K key,V value){
        setKey(key);
        setValue(value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EntryDemo{");
        sb.append("key=").append(key);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}

class TestKV{
    public static void main(String[] args) {
        EntryDemo<Integer, Book> books = new EntryDemo<Integer, Book>();
        books.put(1,new Book(1,"1001","java"));
        books.put(2,new Book(2,"1001","java"));

        System.out.println(books);

        //map集合
        Map<Integer,String> maps = new HashMap<>();
        maps.put(10,"1001");
        maps.put(20,"1002");
        System.out.println(maps);
    }
}