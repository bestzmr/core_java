package tech.aistar.day13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

/**
 * 本类用来演示:泛型的擦除
 *
 * 1. 泛型仅仅在编译期间有效
 * 2. 泛型在运行期间将会被擦除
 * 3. 因此泛型没有多态.
 *
 * @author: success
 * @date: 2020/8/6 1:23 下午
 */
public class GenericRemoveDemo {
    public static void main(String[] args) {
        List<Integer> list01 = new ArrayList<Integer>();
        List<Integer> list02 = new ArrayList<Integer>();

        //获取运行期间的类型...
        //获取类的class实例

        //1. 泛型在运行期间将会被擦除.
        System.out.println(list01.getClass());//class java.util.ArrayList
        System.out.println(list02.getClass());//class java.util.ArrayList

        //3. 泛型没有多态...
        //Number n = new Integer(10);//ok
        //Number m = new Long(10);//ok

        //编译不通过.
        //List<Number> list03 = new ArrayList<Integer>();
    }
}
