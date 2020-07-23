package tech.aistar.util;

import java.util.Arrays;

/**
 * 本类用来演示:数组工具类
 *
 * @author: success
 * @date: 2020/7/22 2:22 下午
 */
@SuppressWarnings("all")
public class ArraysUtil {
    public static void main(String[] args) {
        int[] arr = {5,4,5,5,5,8,5,2,4};

       // System.out.println(Arrays.toString(insertOneElement(arr,2,100)));

        System.out.println(Arrays.toString(delDoubleElement03(arr)));

        //System.out.println(Arrays.toString(arr));

        //System.out.println(getMaxElement(arr));

        //int[] pos = getIndexByTarget(arr,5);
       // System.out.println(Arrays.toString(pos));


//        int[] temp = delByPos(arr,3);
//
//        System.out.println(Arrays.toString(temp));
//
//        System.out.println(Arrays.toString(arr));

        //arr = temp;

       // System.out.println(Arrays.toString(arr));

        //System.out.println(Arrays.toString(delDoubleElement01(arr)));
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
     * 操作数组的原则 - 尽量不要对原来的数组进行直接的操作.
     *
     * 根据下标进行删除操作
     *  {5,4,5,7,2,1,5};
     *
     *  假设index = 3
     *
     *  思路:从index位置开始,后面的覆盖前面的 - arr[i] = arr[i+1]
     *  {5,4,5,2,1,5,5};
     *
     * main arr -> [......]  <- 方法arr
     *
     *      temp-> [.....]
     *
     * @param arr
     * @param index
     * @return
     */
    public static int[] delByPos(int[] arr,int index){
        if(null == arr || arr.length==0 || index<0 || index>arr.length-1)
            return new int[0];

        int[] temp = new int[arr.length];
        //数组的拷贝.arr数据全部拷贝到temp数组中
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        for (int i = index; i < temp.length-1; i++) {
            temp[i] = temp[i+1];
        }

        //继续创建一个数组 - 去除最后一个重复的数据
        int[] news = new int[temp.length-1];
        for (int i = 0; i < temp.length - 1; i++) {
            news[i] = temp[i];
        }

        //temp = Arrays.copyOf(temp,temp.length-1);

        return news;

      //  return temp;
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
        if(null == arr || arr.length == 0)
            return new int[0];

        //1. 确定target是否存在
        int count = 0;

        //2. 遍历arr
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                count++;
        }

        if(count==0)
            return new int[0];

        //3. target肯定是存在
        //确定新的数组的长度 - 新的数组就是不包含target元素的数组
        int[] temp = new int[arr.length - count];

        //定义下标计数器
        int pos = 0;

        //4. 遍历原来的数组
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != target){
                temp[pos++] = arr[i];
            }
        }

        return temp;
    }

    /**
     * 数组排重 - 去除数组中重复的数据,只保留1个.
     *
     * 思路:
     * arr = {5,4,5,7,2,1,5};
     *
     * 定义数组
     * temps= {0,0,0,0,0,0,0};
     *
     * 永远将arr[0]放入到temp中 -> temp[0] = 5
     * temps= {5,0,0,0,0,0,0};
     *
     * 调用根据元素删除的方法->立即到arr中将刚刚的arr[0]全部删除
     * temp -> {4,7,2,4,1};
     *
     * arr = temp;
     *
     * temps[1] = arr[0] = 4
     * temps= {5,4,7,2,0,0,0};
     *
     * arr->{1}
     *
     *
     * @param arr
     * @return
     */
    public static int[] delDoubleElement01(int[] arr){
        if(null == arr || arr.length == 0)
            return new int[0];

        //定义一个新的数组
        int[] temp = new int[arr.length];//默认都是0

        //定义一个下标计数器
        int pos = 0;

        do{
            //永远将arr[0]放入到新的数组中去
            temp[pos++] = arr[0];

            arr = delByTarget(arr,arr[0]);//背后藏的东西

            if(arr.length == 0)
                break;
        }while(true);

        temp = Arrays.copyOf(temp,pos);
        return temp;
    }

    /**
     * 思路:
     * {5,4,5,7,2,1,5};
     *
     * temp -> {5,4,7,2,1,5} <- arr
     *
     * 每次拿当前下标对应的值和这个下标后面的所有的值进行比较
     * 如果后面的下标对应的值 = 当前下标对应的值
     * 那么就调用根据下标删除后面的值
     *
     *
     *
     * 数组排重 - 去除数组中重复的数据,只保留1个.
     * @param arr
     * @return
     */
    public static int[] delDoubleElement02(int[] arr){
        if(null == arr || arr.length==0){
            return new int[]{-1};
        }
        // 1 2 2 2 5 6 7
        // 1 2 2 5 6 7 -> arr
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                //如果后面的下标对应的值 = 当前下标对应的值
                if(arr[i] == arr[j]){
                    //删除j下标对应的数据
                    arr = delByIndex(arr,j);
                    j--;
                }
            }
        }

        return arr;
    }

    /**
     * 经典小孩报数
     *
     * 1 2 3 4 5 6 7 8 9 10
     *
     * t f f t t f t t f t
     *
     * 每次报到3的小孩出列,打印出列的顺序
     *
     * 数组排重 - 去除数组中重复的数据,只保留1个.
     * @param arr
     * @return
     */
    public static int[] delDoubleElement03(int[] arr){
        if(null == arr || arr.length==0)
            return null;

        //1. 布尔类型的数组
        boolean[] flags = new boolean[arr.length];

        //2. 全部设置成true;
        for (int i = 0; i < flags.length; i++) {
            flags[i] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    flags[j] = false;
                }
            }
        }

        //System.out.println(Arrays.toString(flags));

        //定义一个计数器 - 新数组的长度
        int count = 0;
        for (int i = 0; i < flags.length; i++) {
            if(flags[i])
                count++;
        }

        int[] temp = new int[count];

        int pos = 0;//下标计数器

        for (int i = 0; i < arr.length; i++) {
            if(flags[i]){
                temp[pos++] = arr[i];
            }
        }
        return temp;
    }

    /**
     * 在arr数组的指定pos下标处插入一个指定的值target
     * @param arr
     * @param pos
     * @param target
     * @return
     */
    public static int[] insertOneElement(int[] arr,int pos,int target){
        //参数有效性判断....

        //1. 定义一个新的目标数组
        int[] temp = new int[arr.length+1];

        // {1,2,34,4,5};

        //2. pos之前
        System.arraycopy(arr,0,temp,0,pos);
        //3. pos处
        temp[pos] = target;
        //4. pos之后
        System.arraycopy(arr,pos,temp,pos+1,arr.length-pos);

        return temp;
    }

    /**
     * 在arr数组的指定pos下标处插入N个指定的值target
     * @param arr
     * @param pos
     * @param target
     * @return
     */
    public static int[] insertOneElement02(int[] arr,int pos,int... target){
        return null;
    }
}
