package tech.aistar.day14.practice;

import java.util.*;

/**
 * @author: Merlin
 * @time: 2020/8/7 16:46
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("王昭君", "....");
        map.put("妲己", "妲己陪你玩");
        map.put("鲁班", "智商250");
        map.put("鲁班", "智商260");

        System.out.println(map.size());
        System.out.println(map.get("鲁班"));

        System.out.println(map.isEmpty());
        Collection<String> values = map.values();
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println("key:" + key + " values:" + values);
        }
        Set<Map.Entry<String, String>> setEntry = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = setEntry.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }

}
