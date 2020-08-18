package tech.aistar.day17.practice;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author: Merlin
 * @time: 2020/8/18 9:21
 */
public class FieldDemo {
    public static void main(String[] args) {
        Class<?> c = Point.class;
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(Modifier.toString(field.getModifiers()) + " ");
            Class<?> typeClass = field.getType();
            System.out.println(typeClass.getSimpleName() + " ");
            System.out.println(field.getName());

        }
        System.out.println("====获取指定字段信息=====");
        try {
            Field xField = c.getDeclaredField("x");
            Point p = (Point) c.newInstance();
            xField.setAccessible(true);
            xField.set(p, 100);
            System.out.println(p);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
