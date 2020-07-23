package tech.aistar.day05;

/**
 * 本类用来演示: char类型数组
 *
 * @author: success
 * @date: 2020/7/23 3:23 下午
 */
public class CharArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arr);//内存地址 - [I@330bedb4
        //getClass().getName() + "@" + Integer.toHexString(hashCode());
        System.out.println(arr.getClass().getName()+"@"+Integer.toHexString(arr.hashCode()));

        char[] crr = {'a','b','c'};
        System.out.println(crr);//abc
    }
}
