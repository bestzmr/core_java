package tech.aistar.day05;

import java.util.Arrays;

/**
 * 本类用来演示: 数组排序方式
 *
 * @author: success
 * @date: 2020/7/23 10:22 上午
 */
public class ArraySortDemo {
    public static void main(String[] args) {
        int[] arr = {5,3,9,1,6,7,2,4,0,8};

        //System.out.println(getPos(arr,0,arr.length-1));

        System.out.println(Arrays.toString(fastSort(arr,0,arr.length-1)));
    }

    public static int[] fastSort(int[] arr,int start,int end){
        if(start<end){
            //1. 确定重合的位置 - 分区
            int pos = getPos(arr,0,end);

            //2. 递归调用
            fastSort(arr,0,pos-1);
            fastSort(arr,pos+1,end);
        }
        return arr;
    }

    /**
     *
     * @param arr
     * @return 重合的下标位置.
     */
    public static int getPos(int[] arr,int start,int end){
        int i = start;
        int j = end;
        //把数组中的第一个元素作为基准数
        int x = arr[i];

        //循环
        while(i<j){//没有重合的时候,继续循环.
            //**由后向前找比它小的数,找到后挖出此数填到前一个坑中**
            while(i<j && arr[j]>=x){
                j--;
            }
            //确定坑位为j下标的位置
            //把j坑对应的值放入到上一个坑位中
            if(i<j){
                arr[i] = arr[j];
                i++;
            }

            //**由前向后找比它大或等于的数,找到后也挖出此数填到前一个坑中**
            while(i<j && arr[i]<x){
                i++;
            }

            //确定一个坑位i
            if(i<j){
                arr[j] = arr[i];
                j--;
            }
        }
        //把基准数放入到重合的位置
        arr[i] = x;
        return i;//重合的位置.
    }
}
