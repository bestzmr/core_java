package tech.aistar.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 本类用来演示:集合的细节操作
 * 1. 如果修改的原来集合的结构,那么是不会对构建出来的集合造成影响.
 * 2. 如果涉及到的是原来集合中的具体属性数据的时候,那么才会对构建出来的集合造成了影响.
 *
 * @author: success
 * @date: 2020/8/11 2:18 下午
 */
public class ListDetailDemo {
    public static void main(String[] args) {
        List<Book> lists = new ArrayList<>();
        lists.add(new Book(1,"1001","java"));
        lists.add(new Book(2,"1002","python"));
        lists.add(new Book(3,"1003","web"));


        //定义一个集合的时候,可以通过另外一个集合
        List<Book> books = new ArrayList<>(lists);

        //注意点:
        //随机打乱一个集合
        Collections.shuffle(lists);

        //反转
        Collections.reverse(lists);

        //没有对books造成影响.
        books.forEach(e-> System.out.println(e));

        //有影响
        //lists.get(0).setBookName("success");

        //books.forEach(e -> System.out.println(e));
    }
}
