package tech.aistar.day05;

import java.util.Arrays;

/**
 * 本类用来演示: 二维数组
 *
 * @author: success
 * @date: 2020/7/23 2:40 下午
 */
public class TwoArrayDemo {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        //1. 通过普通for循环进行赋值
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random()*10+1);
            }
        }

        //2. 定义二维数组的同时进行赋值
        int[][] ages = {{18,18,20},{21,22,20},{18,20,22}};

        //3. 可以先声明一个二维数组,然后一行一行进行赋值
        int[][] prices = new int[3][2];

        prices[0] = new int[]{11,2};
        prices[1] = new int[]{12,2};
        prices[2] = new int[]{13,2};



        //1.下标遍历

        //2. for遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        //双层for循环进行遍历
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
                System.out.print(ages[i][j]+"\t");
            }
            System.out.println();
        }

        //增强for循环来进行遍历
        for (int[] pcs : prices) {
            for (int pc : pcs) {
                System.out.print(pc+"\t");
            }
            System.out.println();
        }

        System.out.println("=====华丽丽的分割线======");

        int[][] mnns = new int[3][];//列省略 - 但是列在使用之前,一定要先进行初始化.
        mnns[0] = new int[]{1};//给第一行进行初始化
        mnns[1] = new int[]{10,20};//给第一行进行初始化
        mnns[2] = new int[]{10,20,30};//给第一行进行初始化

        System.out.println(Arrays.deepToString(mnns));
    }
}
