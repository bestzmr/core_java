package tech.aistar.design.singleton.enums;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 本类用来演示:
 *
 * @author: success
 * @date: 2020/8/5 3:45 下午
 */
public class TestSingleton07 {
    public static void main(String[] args) {
        Singleton07 s1 = Singleton07.getInstance();
        Singleton07 s2 = Singleton07.getInstance();

        System.out.println(s1 == s2);//true

        //尝试使用反射技术来破坏...
        //1. 获取class实例
        Class<?> c = Singleton07.class;

        try {
            //每个构造方法都对应对应一个constructor实例.
            //拿到的是一个空参构造...

            //java.lang.NoSuchMethodException:
            // tech.aistar.design.singleton.enums.Singleton07.<init>()

            //父类java.lang.Enum
            //protected Enum(String name, int ordinal) {
            //        this.name = name;
            //        this.ordinal = ordinal;
            //    }

            //调用两参构造
            Constructor<?> constructor = c.getDeclaredConstructor(String.class,int.class);

            constructor.setAccessible(true);

            //仍然还是会继续报错....

            //newInstance方法的底层.. - Cannot reflectively create enum objects

            // if ((clazz.getModifiers() & Modifier.ENUM) != 0)
            //            throw new IllegalArgumentException("Cannot reflectively create enum objects");

            //在底层会对类型进行判断,如果发现是枚举类型,则抛出异常...
            Singleton07 s3 = (Singleton07) constructor.newInstance("INSTANCE",0);


        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
