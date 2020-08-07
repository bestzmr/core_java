package tech.aistar.day14;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        //    key    value
        Map<String, String> map = new HashMap<String, String>();
        // 添加元素
        map.put("王昭君","。。。。");
        map.put("妲己", "妲己陪你玩");
        map.put("鲁班", "智商250");
        map.put("鲁班", "智商260");
        // 输出map中键值对的个数，键值唯一
        System.out.println(map.size());
        // 根据key获取value-》出现key值重复设置，则value会发生替换
        System.out.println(map.get("鲁班"));
        System.out.println(map.isEmpty());
        // 返回map中所有value构成的集合
        Collection<String> values = map.values();

        // 返回map中所有key值构成的集合
        Set<String> keys = map.keySet();
        // 遍历map，输出map中的键值对
        for(String key:keys){
            System.out.println("key:" + key + " value:" + map.get(key));
        }

        // Key Value -> Entry{ key  value}
        Set<Map.Entry<String, String>> setEntry = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = setEntry.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }

}
