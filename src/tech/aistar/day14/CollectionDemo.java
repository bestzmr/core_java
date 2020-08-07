package tech.aistar.day14;

import java.util.*;


public class CollectionDemo {
    public static void main(String[] args) {
        // 如果忽略泛型，以Object类型看待
        //  List list = new ArrayList();

        // String 表示泛型，泛型定义了集合中存储的元素类型
        List<String> list = new ArrayList<String>();
        // 集合中由多少个元素
        System.out.println(list.size()); // 0
        System.out.println(list.isEmpty());  // true
        list.add("西游记");
        System.out.println(list.isEmpty());  // false
        System.out.println(list.size());  // 1

        Collection<String> list1 = new ArrayList<String>();
        list1.add("水浒传");
        // 像当前集合中添加另外一个集合
        list.addAll(list1);
        System.out.println(list.size()); // 2
        // 清空集合元素
        list.clear();
        System.out.println(list.size()); // 0

        // 集合的遍历
        list.add("红楼梦");
        list.add("三国演义");
        // Collection中没有根据索引（下标）获取数据的方法
        for(String value:list){
            System.out.println(value);
        }
        // 迭代器遍历方式
        Iterator<String> stringIterator = list.iterator();
//        Iterator<String> stringIterator = list.listIterator();
        // hasNext是否由下一个元素
        while (stringIterator.hasNext()){
            // 获取下一个元素
            String value = stringIterator.next();
            System.out.println(value);
        }
        // for循环遍历  集合索引从0开始
        for(int i = 0; i < list.size(); i ++){
            System.out.println(list.get(i));
        }


        // 数组类型  String
        String[] strings = new String[list.size()];
        // 集合中的所有元素映射到数组中了
        list.toArray(strings);
        for (String s:strings){
            System.out.println(s);
        }


    }


}
