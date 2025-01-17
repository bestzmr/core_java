package tech.aistar.day03.transfer;


import java.util.Arrays;

/**
 * 本类用来演示:对象类型的方法参数传递的方式
 *
 * @author: success
 * @date: 2020/7/20 1:54 下午
 */
public class ObjTransferDemo {
    public static void main(String[] args) {
        //数组就是一个对象类型

        //基本类型是存储在JVM的栈[创建和销毁的速度比较快].

        //埋一个"种子"

        //当程序执行到此处的时候,会在JVM中的堆里面申请空间,然后进行初始化操作
        //这个空间就是用来保存这个数组对象{1,2,3}

        //每个对象在JVM中的堆中都会有一个内存地址

        //= 将这个对象的堆中的内存地址赋值给了一个变量arr,arr专业名词引用
        //然后将这个arr引用存储在JVM的栈中.

        //引用和对象是什么关系?引用中保存的是对象在堆空间中的内存地址.
        int[] arr  = {1,2,3};

        //int[] arr1 = {1,2,3};

        //System.out.println(arr);//[I@330bedb4

        //System.out.println(arr == arr1);//false


        //栈         堆
        //arr    -> {1,2,3}


        //形参arr 和 arr 指向的都是{1,2,3}

        //对象类型把arr的值的副本传递到了方法中.
        adds(arr);

        System.out.println("main->"+Arrays.toString(arr));//[2,3,4]

    }

    private static void adds(int[] arr) {
        //不用关心代码 - 数组中的每个数据+1
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        //只是输出这个数组
        System.out.println("方法内部:"+Arrays.toString(arr));//[2,3,4]
    }
}
