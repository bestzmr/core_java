package tech.aistar.day16;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: Merlin
 * @time: 2020/8/16 10:07
 */
public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("1", "123");
        hashtable.put("2", "123");
        hashtable.put("3", "123");
        hashtable.put("4", "123");
//        HashMap
//        new ConcurrentHashMap().put(null,null);
        new TreeMap();

        Enumeration<String> enumeration = hashtable.keys();

        while (enumeration.hasMoreElements()) {
            String s = enumeration.nextElement();
            System.out.println(hashtable.get(s));

        }
    }

}
