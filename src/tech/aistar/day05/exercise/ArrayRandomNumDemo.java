package tech.aistar.day05.exercise;

import java.util.Arrays;

/**
 * 本类用来演示:数组长度5个,里面存放1~6之间的随机整数.要求是不能有重复的数据.
 *
 * @author: success
 * @date: 2020/7/22 2:16 下午
 */
public class ArrayRandomNumDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];

        insert(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void insert(int[] arr) {
        //1. 通过普通for循环进行赋值
        for (int i = 0; i < arr.length; i++) {
            //随机生成一个数
            int n = (int) (Math.random()*6+1);

            //先将n放入到数组中
            arr[i] = n;

            //判断n在arr中之前是否曾经出现过
            //如果出现过 - "后悔"
            for (int j = 0; j < i; j++) {
                if(n == arr[j]){
                    //"后悔了..."
                    i--;
                    break;
                }
            }
        }
    }
}
