package tech.aistar.day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 本类用来演示: ?
 *
 * @author: success
 * @date: 2020/8/6 1:31 下午
 */
public class WenHaoDemo {
    public static void main(String[] args) {
        //一旦泛型使用了?,那么所有的操作都不能和对象有关系.
        List<?> list = new ArrayList<>();

        //list.add("ok");//error
        //list.add(12);//error

        list.add(null);
        list.add(null);

        System.out.println(list.get(1));

        List<Integer> list01 = new ArrayList<>();
        list01.add(10);
        list01.add(20);
        list01.add(30);

        List<Long> list02 = new ArrayList<>();
        list02.add(100L);
        list02.add(200L);
        list02.add(300L);

        //设置一个方法,这俩种集合都可以输出
        printList(list01);
        printList(list02);
    }

    /**
     * ? extends Number - 此处的泛型可以是Number类型本身或者Number类型子类.
     * @param list
     */
    public static void printList(List<? extends Number> list){
        //遍历集合 - 集合的特有的迭代方式
//        Iterator<? extends Number> iter = list.iterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
        list.forEach(e-> System.out.println(e));
    }
}
