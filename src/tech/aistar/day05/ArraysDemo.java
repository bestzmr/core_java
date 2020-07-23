package tech.aistar.day05;

import java.util.Arrays;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/7/23 3:41 下午
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        System.out.println(arr1 == arr2);//false

        //业务 - 数组中的数据一样,就希望返回true
        System.out.println(Arrays.equals(arr1,arr2));//true

        int[] arr3 = {5,7,6,2,1};

        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3));//[1, 2, 5, 6, 7]
    }
}
