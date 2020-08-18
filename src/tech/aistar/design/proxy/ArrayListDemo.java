package tech.aistar.design.proxy;

import java.util.Arrays;
import java.util.List;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/18 3:05 下午
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ok","java");
        System.out.println(list.getClass());
        //System.out.println(list.remove(1));
    }
}
