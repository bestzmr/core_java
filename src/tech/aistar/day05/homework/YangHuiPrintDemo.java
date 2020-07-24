package tech.aistar.day05.homework;

import java.util.Arrays;

/**
 * 本类用来演示:杨辉三角
 *
 * @author: success
 * @date: 2020/7/24 9:08 上午
 */
public class YangHuiPrintDemo {
    public static void main(String[] args) {
        int[][] temp = test(5);
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j]+"\t");
            }
            System.out.println();
        }
    }

    /**
     *
     * @param n 行数
     * @return
     */
    public static int[][] test(int n){
        int[][] arr = new int[n][];//列可以省略不写,但是在使用之前一定要先进行初始化

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1];//一定要先进行初始化操作.
            for (int j = 0; j <=i;j++) {
                if(j == 0 || i == j || i==0)
                    arr[i][j] = 1;
                else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }
        return arr;
    }
}
