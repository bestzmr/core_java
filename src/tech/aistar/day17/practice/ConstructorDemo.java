package tech.aistar.day17.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * @author: Merlin
 * @time: 2020/8/18 21:11
 */
public class ConstructorDemo {
    public static void main(String[] args) {
        Class<?> c = Point.class;
        Constructor<?>[] constructors = c.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(Modifier.toString(constructor.getModifiers()) + " ");
            System.out.println(constructor.getName() + "(");
            Class<?>[] types = constructor.getParameterTypes();

            for (int i = 0; i < types.length; i++) {
                System.out.println((i != types.length - 1) ? (types[i].getSimpleName() + ",") : (types[i].getSimpleName()));
            }

            System.out.println(")");
            System.out.println("====反射调用构造====");

            try {
                Point p = (Point) c.newInstance();
                Constructor<?> c1 = c.getDeclaredConstructor();
                Point p2 = (Point) c1.newInstance();
                Constructor<?> c2 = c.getDeclaredConstructor(int.class, String.class);
                Point p3 = (Point) c2.newInstance(200, "java");

            } catch (InstantiationException e) {
                e.printStackTrace();

            } catch (IllegalAccessException e) {
                e.printStackTrace();

            } catch (NoSuchMethodException e) {
                e.printStackTrace();

            } catch (InvocationTargetException e) {
                e.printStackTrace();

            }
        }
    }
}
