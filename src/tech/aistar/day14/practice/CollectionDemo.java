package tech.aistar.day14.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author: Merlin
 * @time: 2020/8/7 16:37
 */
public class CollectionDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("西游记");
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        Collection<String> list1 = new ArrayList<>();
        list1.add("水浒传");
        list.addAll(list1);

        System.out.println(list.size());
        list.clear();

        System.out.println(list.size());

        list.add("红楼梦");
        list.add("三国演义");
        for (String value : list) {
            System.out.println(value);
        }

        Iterator<String> stringIterator = list.iterator();
        while (stringIterator.hasNext()) {
            String value = stringIterator.next();
            System.out.println(value);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        String[] strings = new String[list.size()];
        list.toArray(strings);
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
