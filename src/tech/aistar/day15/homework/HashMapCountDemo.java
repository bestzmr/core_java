package tech.aistar.day15.homework;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/12 8:38 上午
 */
public class HashMapCountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串:>");
        String str = sc.nextLine();
        count(str);
    }

    public static void count(String str){
        //1. 将字符串转换成字符数组
        char[] arr = str.toCharArray();
        //2. 创建一个Map集合,key = 字符串,value=字符串的个数
        Map<Character,Integer> maps = new HashMap<>();
        //3. 遍历arr
        for (char c : arr) {
            //判断maps集合中是否包含c
            if(maps.containsKey(c)){
                maps.put(c,maps.get(c)+1);
            }else{
                maps.put(c,1);
            }
        }
        //4. 排序规则 - 根据次数升序排,然后一样的时候,继续根据字母降序排.
        //直接使用Entry对象

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(maps.entrySet());

        list.sort((e1,e2)->{
            if(e1.getValue()>e2.getValue())
                return 1;
            else if(e1.getValue() == e2.getValue()){
                return e2.getKey().compareTo(e1.getKey());
            }
            return -1;
        });

        list.forEach(e-> System.out.println(e));
    }
}
