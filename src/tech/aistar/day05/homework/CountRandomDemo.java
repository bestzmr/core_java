package tech.aistar.day05.homework;

import tech.aistar.util.ArraysUtil;

import java.util.Arrays;

/**
 * 本类用来演示:作业 - 统计随机数出现的次数,并且根据出现的次数进行降序排列
 *
 * @author: success
 * @date: 2020/7/24 8:34 上午
 */
public class CountRandomDemo {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*5+1);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("========");

        count(arr);
    }

    public static void count(int[] arr){
        //1. 确定arr中不同的随机数的个数.
        //确定了不同的随机数的个数 - 确定了二维数组的行数.

        //1-1. 调用数组去重的方法
        int[] temp = ArraysUtil.delDoubleElement01(arr);

        //1-2. 确定二维数组 - 行数 - 随机数的个数,列数 - 2列
        int[][] counts = new int[temp.length][2];

        //使用到了二维数组的赋值方式 - 通过一行一行进行赋值.
        //定义一个下标计数器
        int pos = 0;

        //1-3. 通过程序得到的结果赋值给了counts二维数组.

        //2. 统计每个随机数出现的次数
        for (int i = 0; i < temp.length; i++) {
            //2-1. 定义一个计数器 - 统计随机数出现的次数
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if(temp[i] == arr[j]){
                    count++;
                }
            }
            //统计了好了当前的temp[i]出现的次数了.
            counts[pos++] = new int[]{temp[i],count};
        }

        //3. 遍历counts
        //System.out.println(Arrays.deepToString(counts));

        for (int i = 0; i < counts.length; i++) {
            for (int j = i+1; j < counts.length; j++) {
                if(counts[i][1]<counts[j][1]){
                    //使用中间的临时变量
                    int[] tmp = counts[i];
                    counts[i] = counts[j];
                    counts[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.deepToString(counts));
    }
}
