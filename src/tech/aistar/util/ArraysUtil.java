package tech.aistar.util;

import java.util.Arrays;

/**
 * 本类用来演示:数组工具类
 *
 * @author: success
 * @date: 2020/7/22 2:22 下午
 */
public class ArraysUtil {
    public static void main(String[] args) {
        int[] arr = {5,4,5,7,2,1,5};

        //System.out.println(getMaxElement(arr));

        //int[] pos = getIndexByTarget(arr,5);
       // System.out.println(Arrays.toString(pos));


        int[] temp = delByIndex(arr,3);

        System.out.println(Arrays.toString(temp));

        //System.out.println(Arrays.toString(sort(arr)));

        //arr = temp;

       // System.out.println(Arrays.toString(arr));
    }

    /**
     * 找出数组中最大的值.
     * @param arr
     * @return
     */
    public static int getMaxElement(int[] arr){
        if(null == arr || arr.length==0)
            return -1;//返回错误的标记即可.
        //定义一个变量,用来保存最值
        int max = arr[0];//假设的是数组第一个元素是最大的

        //遍历数组
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)
                max = arr[i];
        }

        return max;
    }

    /**
     * 找出数组arr中target元素对应的所有的下标
     * @param arr
     * @param target 元素
     * @return
     */
    public static int[] getIndexByTarget(int[] arr,int target){
        if(null == arr || arr.length == 0)
            //return null;
            return new int[0];

        //1. 思考target在数组中存不存在!
        //1-1. 定义一个变量,用来统计target出现的次数
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                count++;
        }

        if(count == 0)//说明数组中不存在target元素.
            return new int[0];

        //2.确定新数组 - 元素类型以及数组的长度.
        int[] temp = new int[count];//存储target对应的所有的下标的数组

        //定义一个下标计数器
        int pos = 0;

        //3. 遍历原来的数组
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                temp[pos++] = i;
        }

        return temp;
    }

    /**
     * 根据下标删除数组中的元素
     *
     * 思路:int[] arr = {5,4,5,7,2,1,5};
     *      int[] temp = new int[arr.length-1];//下标是唯一的
     *
     *      1. 遍历arr -> i!=index -> arr[i]放入到新的temp中.
     *
     *      2. 如果是index位置的值,不把它放入到temp中
     *
     *      3. 返回temp数组 - 给我们的感觉好像是进行删除操作.
     *
     * @param arr
     * @param index 下标是唯一的
     * @return
     *
     * main -> arr ->  [5,4,5,7,2,1,5]     方法的arr
     *
     *         [5,4,5,2,1,5]  <- temp
     */
    public static int[] delByIndex(int[] arr,int index){
        if(null == arr || arr.length==0 || index<0 || index>arr.length-1)
            return new int[0];


        //1. 确定新的数组
        int[] temp = new int[arr.length-1];

        //2. 为了新的数组下标的连续性
        int pos = 0;

        //3. 遍历原来的数组,进行数据的筛选
        for (int i = 0; i < arr.length; i++) {
            if(i!=index){
                temp[pos++] = arr[i];
            }
        }

        //arr = temp;

        return temp;
    }

    /**
     * 根据元素进行删除
     *
     * 1. 先确定target出现的次数
     *
     * 2. int[] temp = new int[arr.length - count];
     *
     * 3. 遍历arr
     *    3-1. arr[i] == target ,  arr[i]就不要放入到temp中
     *    3-2/ arr[i]!=target, temp[pos++] = arr[i];
     *
     * 4. return temp;
     *
     * 删除数组中所有的target元素.
     * @param arr
     * @param target
     * @return
     */
    public static int[] delByTarget(int[] arr,int target){

        return null;
    }

    /**
     * 数组排重 - 去除数组中重复的数据,只保留1个.
     * @param arr
     * @return
     */
    public static int[] delDoubleElement01(int[] arr){
        return null;
    }

    /**
     * 数组排重 - 去除数组中重复的数据,只保留1个.
     * @param arr
     * @return
     */
    public static int[] delDoubleElement02(int[] arr){
        return null;
    }

    /**
     * 数组排重 - 去除数组中重复的数据,只保留1个.
     * @param arr
     * @return
     */
    public static int[] delDoubleElement03(int[] arr){
        return null;
    }
}
