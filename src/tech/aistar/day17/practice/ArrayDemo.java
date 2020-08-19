package tech.aistar.day17.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Merlin
 * @time: 2020/8/18 21:18
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        String[] arr2 = {"java", "python", "php"};
        int[] temp = (int[]) exchange(arr1);
        System.out.println(Arrays.toString(temp));

        String temp2[] = (String[]) exchange(arr2);
        System.out.println(Arrays.toString(temp2));

    }

    private static Object exchange(Object arr) {
        int len = Array.getLength(arr);
        Class<?> type = arr.getClass().getComponentType();
        List list;
        Object temp = Array.newInstance(type, len << 1);
        for (int i = 0; i < len; i++) {
            Object value = Array.get(arr, i);
            Array.set(temp, i, value);
        }
        return temp;
    }
}
