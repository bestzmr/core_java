package tech.aistar.design.singleton.enums;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 本类用来演示: 反射技术来破坏单例
 *
 * @author: success
 * @date: 2020/8/5 3:36 下午
 */
public class TestSingleton04Demo {
    public static void main(String[] args) {
        Singleton04Demo s1 = Singleton04Demo.getInstance();
        Singleton04Demo s2 = Singleton04Demo.getInstance();
        System.out.println(s1 == s2);//true

        System.out.println("========");

        //java.lang.Class<T> 是反射技术的基础类
        Class<?> c = Singleton04Demo.class;

        try {
            Constructor<?> constructor = c.getDeclaredConstructor();


            //反射技术同时也是可以破坏封装性的.
            constructor.setAccessible(true);

            //反射的技术来构建一个类的对象
            Singleton04Demo s3 = (Singleton04Demo) constructor.newInstance();

            System.out.println(s1 == s3);//false

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
