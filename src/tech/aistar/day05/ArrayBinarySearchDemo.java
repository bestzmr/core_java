package tech.aistar.day05;

import java.util.Arrays;


/**
 * 本类用来演示: 二分搜索法 - 数组中第一次出现的数据
 *
 * @author: success
 * @date: 2020/7/23 9:52 上午
 */
public class ArrayBinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,6};//排好序的数组

        //int ele = Arrays.binarySearch(arr,6);
        int index= binarySearchs(arr,6);

        System.out.println(index);
    }

    /**
     * * 二分查找 - 二分搜索法 - 每次比较完之后,都会减少一半的数据.
     *
     *   业务中有的数据是唯一的.
     *
     *   **找出数组中某个元素第一次出现的位置.**
     *
     *   前提:对排好序的数组可以采用二分查找.
     *
     *   1,2,3,4,5,6,7,8
     *
     *   * 起始索引 - startIndex - 0
     *   * 结束索引 - endIndex - 1
     *   * 中间索引 - centerIndex = (startIndex + endIndex)/2 = 3
     *
     *   确定中间索引的值是4.
     *
     *   * 正好找的值就是4,直接返回centerIndex.
     *
     *   * 如果找的目标值比中间索引处的值大.
     *
     *     startIndex = centerIndex+1;
     *
     *   * 如果找的目标值比中间索引处的值小.
     *
     *     endIndex = centerIndex-1;
     * @param arr
     * @param target
     * @return
     */
    private static int binarySearchs(int[] arr, int target) {
        //1. 起始索引
        int startIndex = 0;
        //2. 结束索引
        int endIndex = arr.length-1;

        //3. 循环
        while(startIndex<=endIndex){
            //3. 中间索引
            int centerIndex = (startIndex + endIndex) >>> 1;

            if(target == arr[centerIndex])
                return centerIndex;
            else if(target>arr[centerIndex]){
               startIndex = centerIndex + 1;
            }else{
                endIndex = centerIndex - 1;
            }
        }

        return -1;
    }
}
