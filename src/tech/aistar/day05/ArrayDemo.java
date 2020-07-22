package tech.aistar.day05;

/**
 * 本类用来演示:数组的基本语法
 *
 * @author: success
 * @date: 2020/7/22 10:09 上午
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //1. 定义一个长度为3的int型数组
        int[] arr = new int[3];
        System.out.println(arr);//[I@330bedb4

        //数组的赋值方式
        //1. 可以通过下标一一赋值
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;

        //2. 可以通过普通for循环进行赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100+1);
        }

        //java.lang.ArrayIndexOutOfBoundsException - 数组下标越界异常.
        //System.out.println(arr[3]);

        //数组的遍历方式
        //1. 可以通过下标一一进行遍历
        //System.out.println(arr[0]);

        //获取数组的长度,长度不是方法,是属于数组对象的属性
        //System.out.println(arr.length);//3

//        String[] strs = new String[3];
//        //对象类型默认值是null
//        System.out.println(strs[0]);

        //2. 可以通过普通for循环遍历...
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
