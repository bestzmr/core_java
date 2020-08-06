package tech.aistar.design.factory.generic;

import tech.aistar.day08.relation.extend.Cat;
import tech.aistar.day08.relation.extend.Dog;

/**
 * 本类用来演示:通用的工厂 - 可以用来创建任意对象
 *
 * @author: success
 * @date: 2020/8/6 10:25 上午
 */
public class ObjectFactory {

    public static Object getInstance(String className){
        Object obj = null;

        //1. 获取class实例
        try {
            Class<?> c = Class.forName(className);

            //反射创建类的对象...
            obj = c.newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return obj;
    }

    /**
     * 泛型应用在工厂
     * @param className
     * @param <T>
     * @return
     */
    public static <T> T createInstance(String className){
        T t = null;
        try {
            Class<?> c = Class.forName(className);
            t = (T) c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return t;
    }

    public static <T> T createInstance2(T ts){
       T t = null;

       Class<?> c = ts.getClass();

        try {
            t = (T) c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return t;
    }
}

class TestObjectFactory{
    public static void main(String[] args) {
       // Cat cat = (Cat) ObjectFactory.getInstance("tech.aistar.day08.relation.extend.Cat");

        //Dog dog = (Dog) ObjectFactory.getInstance("tech.aistar.day08.relation.extend.Cat");

        //Dog cat = ObjectFactory.createInstance("tech.aistar.day08.relation.extend.Cat");
        Cat cat = ObjectFactory.createInstance2(new Cat());
    }
}
